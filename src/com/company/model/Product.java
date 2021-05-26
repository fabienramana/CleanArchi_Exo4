package com.company.model;

public class Product {
    String name;
    String description;
    String category;
    String details;

    public Product(String name, String desc, String category, String details){
        this.name = name;
        this.description = desc;
        this.category = category;
        this.details = details;
    }

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
