package com.company.model;

public interface PriceRepository {
    public Price findByProductId(int id);
}
