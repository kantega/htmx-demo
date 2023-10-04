package no.kantega.htmxdemo.web;

import jakarta.validation.Valid;
import no.kantega.htmxdemo.domain.Price;
import no.kantega.htmxdemo.domain.Product;
import no.kantega.htmxdemo.repositories.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public ModelAndView index() {
        return new ModelAndView("/products/index")
                .addObject("products", productRepository.findAll());
    }

    @GetMapping("{id}/add-price")
    public ModelAndView addPrice(@PathVariable int id) {
        Product product = productRepository.findById(id);
        return new ModelAndView("/products/add-price")
                .addObject("command", new AddPriceCommand(product));
    }

    @PostMapping("{id}/add-price")
    public ModelAndView postAddPrice(@PathVariable int id, @ModelAttribute @Valid AddPriceCommand command, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("/products/add-price")
                    .addObject("command", command);
        }

        Product product = productRepository.findById(id);
        Price price = new Price(command.getValidFrom(), command.getPrice());
        product.addPrice(price);
        return new ModelAndView("/products/price")
                .addObject("price", price);
    }

    @DeleteMapping("{productId}/prices/{priceId}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void deletePrice(@PathVariable("productId") int productId, @PathVariable("priceId") int priceId) {
        Product product = productRepository.findById(productId);
        product.deletePrice(priceId);
    }
}
