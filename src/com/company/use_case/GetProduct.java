package com.company.use_case;


import com.company.exception.PriceException;
import com.company.exception.ProductException;
import com.company.model.Product;
import com.company.model.ProductDto;

import java.util.Optional;

public class GetProduct {

    public ProductDto getProduct(Integer productId, Optional<Integer> userId) throws PriceException, ProductException {
        if(userId.isPresent()){
            GetProductAsUser getProductAsUser = new GetProductAsUser(new FakeUsers(), new FakePrices(), new FakeSalesHistory(), new FakeProducts());
            return getProductAsUser.getProduct(productId, userId.get());
        } else {
            GetProductAsPublic getProductAsPublic = new GetProductAsPublic(new FakePrices(), new FakeProducts());
            return getProductAsPublic.getProduct(productId);
        }
    }
}
