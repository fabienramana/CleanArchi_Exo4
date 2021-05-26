package com.company.use_case;

import com.company.model.*;

public class GetProductAsPublic {
    private PriceRepository priceRepository;
    private ProductRepository productRepository;

    public GetProductAsPublic(PriceRepository priceRepository, ProductRepository productRepository) {
        this.priceRepository = priceRepository;
        this.productRepository = productRepository;
    }

    public Product getProduct(int productId){
        Product p = productRepository.findById(productId);

        Price price = priceRepository.findByProductId(productId);

        return p;
    }
}
