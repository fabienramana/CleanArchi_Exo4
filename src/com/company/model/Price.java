package com.company.model;

import java.time.LocalDate;

public class Price {
    Integer productId;
    LocalDate updateDate;
    double price;
    
    public Price(Integer productId, LocalDate date, double price){
        this.productId = productId;
        this.updateDate = date;
        this.price = price;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
