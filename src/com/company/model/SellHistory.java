package com.company.model;


import java.util.Date;

public class SellHistory {
    Integer userId;
    Integer productId;
    Date date;

    public SellHistory(Integer userId, Integer productId, Date date){
        this.userId = userId;
        this.productId = productId;
        this.date = date;
    }
}
