package com.company.model;

import java.util.Optional;

public interface ProductRepository {
    public Optional<Product> findById(int id);
}
