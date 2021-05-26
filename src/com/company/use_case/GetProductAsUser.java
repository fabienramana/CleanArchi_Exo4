package com.company.use_case;

import com.company.exception.PriceException;
import com.company.exception.ProductException;
import com.company.model.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

    public ProductDto getProduct(int productId, int userId) throws PriceException, ProductException {
        User user = userRepository.findById(userId);
        Optional<Product> product = productRepository.findById(productId);
        if(!product.isPresent()) throw new ProductException("Product not found : "+productId);

        Optional<Price> price = priceRepository.findByProductId(productId);
        if(!price.isPresent()) throw new PriceException("Price not found for the product "+productId);

        double productPrice = price.get().getPrice();
        List<SellHistory> sellHistoryList = sellHistoryRepository.findByProductIdAndUserId(productId, userId);

        System.out.println(sellHistoryList.size());
        int nbCommandInLast6Months = getNbCommandInLastMonths(6, sellHistoryList);
        if(nbCommandInLast6Months>3) productPrice *= 0.9;

        int nbCommandInLastYear = getNbCommandInLastMonths(12, sellHistoryList);
        if(nbCommandInLastYear>5) productPrice *= 1.05;

        return new ProductDto(product.get(), productPrice);
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
