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
}
