package no.kantega.htmxdemo.repositories;

import no.kantega.htmxdemo.domain.Price;
import no.kantega.htmxdemo.domain.Product;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {

    List<Product> products = new ArrayList<>();

    static int nextId = 1;

    public ProductRepository() {

        // Adding sample product data to the list
        products.add(createProduct("Laptop", "High-performance laptop", 1000.00, 5));
        products.add(createProduct("Smartphone", "Latest model smartphone", 700.00, 10));
        products.add(createProduct("Headphones", "Noise-cancelling headphones", 150.00, 8));
        products.add(createProduct("Smartwatch", "Fitness tracking smartwatch", 250.00, 3));
        products.add(createProduct("Tablet", "Powerful and lightweight tablet", 500.00, 7));
    }

    private static Product createProduct(String name, String description, double price, int stockQuantity) {
        Product product = new Product(nextId++, name, description, price, stockQuantity);
        for (int i = 0; i < 5; i++) {
            product.addPrice(new Price(LocalDate.now().minusMonths(i), price - 10 * i));
        }
        return product;
    }

    public List<Product> findAll() {
        return products;
    }
}
