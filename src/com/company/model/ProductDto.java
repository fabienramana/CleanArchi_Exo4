package com.company.model;

public class ProductDto extends Product{
    double price;

    public ProductDto(int id, String name, String description, String category, String details, double price) {
        super(id, name, description, category, details);
        this.price = price;
    }

    public ProductDto(Product product, double price) {
        super(product., name, description, category, details);
        this.price = price;
    }
}
