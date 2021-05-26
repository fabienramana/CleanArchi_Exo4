package com.company.model;


import java.util.Date;

public class SellHistory {
    User user;
    Product product;
    Date date;

    public SellHistory(User user, Product product, Date date) {
        this.user = user;
        this.product = product;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
