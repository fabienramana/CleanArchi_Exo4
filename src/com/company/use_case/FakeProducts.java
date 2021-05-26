package com.company.use_case;

import com.company.model.Product;
import com.company.model.ProductRepository;

import java.util.HashMap;
import java.util.Map;

public class FakeProducts implements ProductRepository {
    Map<Integer, Product> products;
    
    public FakeProducts(){
        products = new HashMap<>();
        Product pr1 = new Product();
        products.put(1, pr1);
        Product pr2 = new Product();
        Product pr3 = new Product();
        products.put(2, pr2);
        products.put(3, pr2);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }
}
