package com.company.model;

import java.util.Date;

public class Price {
    Integer productId;
    Date updateDate;
    double price;
    
    public Price(Integer productId, Date date, double price){
        this.productId = productId;
        this.updateDate = date;
        this.price = price;
    }
}
