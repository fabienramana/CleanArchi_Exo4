package com.company.use_case;

import com.company.model.*;

public class GetProductAsUser {
    private UserRepository userRepository;
    private PriceRepository priceRepository;
    private SellHistory sellHistory;
    private ProductRepository productRepository;

    public GetProductAsUser(UserRepository userRepository, PriceRepository priceRepository, SellHistory sellHistory, ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.priceRepository = priceRepository;
        this.sellHistory = sellHistory;
        this.productRepository = productRepository;
    }

    public Product getProduct(int productId, int userId){
        User user = userRepository.findById(userId);
        Product product = productRepository.findById(productId);

        Price price = priceRepository.findByProductId(productId);
        
    }
}
