package com.company.model;

import java.util.Optional;

public interface PriceRepository {
    public Optional<Price> findByProductId(int id);
}
