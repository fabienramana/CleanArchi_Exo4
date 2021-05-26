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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
