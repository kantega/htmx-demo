package no.kantega.htmxdemo.domain;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    // Attributes
    private String name;
    private String description;
    private double price;
    private int stockQuantity;

    private List<Price> prices = new ArrayList<>();

    // Constructor
    public Product(int id, String name, String description, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public int getId() {
        return id;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void addPrice(Price p) {
        prices.add(p);
    }

    public List<Price> getPrices() {
        return prices;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    // Methods
    public boolean isAvailable() {
        return stockQuantity > 0;
    }

    @Override
    public String toString() {
        return String.format(
                "Product: %s\nDescription: %s\nPrice: %.2f\nStock: %d",
                name, description, price, stockQuantity);
    }
}
