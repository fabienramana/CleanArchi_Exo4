package com.company.use_case;

import com.company.model.Product;
import com.company.model.User;

public class getProductAsPublic implements getProduct{
    
    
    @Override
    public Product getProduct(int userId, int productId){
        User user = userRepository.findById();
        Product p = new Product();
        return p;
    }
}
