package com.company.use_case;

import com.company.model.Product;
import com.company.model.ProductRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FakeProducts implements ProductRepository {
    Map<Integer, Product> products;

    public FakeProducts(){
        products = new HashMap<>();
        Product pr1 = new Product(1 ,"Robin des Bois", "petit livre de 40 pages", "Livre", "");
        Product pr2 = new Product(2, "Micro-ondes","un bon micro-ondes","Electroménager","");
        Product pr3 = new Product(3, "Pantalon","Pantalon noir", "Vestimentaire","");
        products.put(1, pr1);
        products.put(2, pr2);
        products.put(3, pr3);
    }

    @Override
    public Optional<Product> findById(int id) {
        return Optional.ofNullable(products.get(id));
    }
}
