package com.company.use_case;

import com.company.model.*;

import java.time.LocalDate;
import java.util.Date;
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

    public ProductDto getProduct(int productId, int userId){
        User user = userRepository.findById(userId);
        Product product = productRepository.findById(productId);

        Price price = priceRepository.findByProductId(productId);
        double productPrice = price.getPrice();
        List<SellHistory> sellHistoryList = sellHistoryRepository.findByProductIdAndUserId(productId, userId);
        int nbCommandInLast6Months = getNbCommandInLastMonths(6, sellHistoryList);
        if(nbCommandInLast6Months>3) productPrice *= 0.9;
        int nbCommandInLastYear = getNbCommandInLastMonths(12, sellHistoryList);
        if(nbCommandInLastYear>5) productPrice *= 1.05;


        return product;
    }

    private int getNbCommandInLastMonths(int months, List<SellHistory> sellHistoryList){
        int nb = 0;
        LocalDate currentDate = LocalDate.now();
        LocalDate productDate = currentDate.minusMonths(months);

        for (int i = 0; i < sellHistoryList.size(); i++) {
            if(sellHistoryList.get(i).getDate().after(java.sql.Date.valueOf(productDate))){
                nb++;
            }
        }
        return nb;
    }
}
