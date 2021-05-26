package com.company.use_case;

import com.company.model.*;

import java.util.List;

public class GetProductAsUser {
    private UserRepository userRepository;
    private PriceRepository priceRepository;
    private SellHistoryRepository sellHistoryRepository;
    private ProductRepository productRepository;

    public GetProductAsUser(UserRepository userRepository, PriceRepository priceRepository, SellHistoryRepository sellHistoryRepository, ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.priceRepository = priceRepository;
        this.sellHistoryRepository = sellHistoryRepository;
        this.productRepository = productRepository;
    }

    public Product getProduct(int productId, int userId){
        User user = userRepository.findById(userId);
        Product product = productRepository.findById(productId);

        Price price = priceRepository.findByProductId(productId);
        List<SellHistory> sellHistoryList = sellHistoryRepository.findByProductIdAndUserId(productId, userId);
        return product;
    }

    private int getNbCommandInLastMonths(int months, List<SellHistory> sellHistoryList){
        int nb = 0;

        return nb;
    }
}
