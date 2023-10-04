package no.kantega.htmxdemo.web;

import jakarta.validation.constraints.NotNull;
import no.kantega.htmxdemo.domain.Product;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import static org.springframework.format.annotation.NumberFormat.Style.CURRENCY;
import static org.springframework.format.annotation.NumberFormat.Style.NUMBER;

public class AddPriceCommand {

    private final String id = UUID.randomUUID().toString();

    private int productId;


    @NotNull
    @NumberFormat(pattern = "###,##0.00")
    private BigDecimal price;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate validFrom;


    public AddPriceCommand() {
    }

    public AddPriceCommand(Product product) {
        productId = product.getId();
        price = product.getPrice().add(BigDecimal.TEN);
        validFrom = LocalDate.now();
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public String getId() {
        return id;
    }
}
