package com.company;

import com.company.exception.PriceException;
import com.company.exception.ProductException;
import com.company.model.ProductDto;
import com.company.use_case.GetProduct;

public class Main {



    public static void main(String[] args) throws PriceException, ProductException {

        GetProduct getProduct = new GetProduct();

        ProductDto p = getProduct.getProduct(1, java.util.Optional.empty());
        System.out.println(p.toString());

        ProductDto p1 = getProduct.getProduct(1, java.util.Optional.of(1));
        System.out.println(p1.toString());

        ProductDto p2 = getProduct.getProduct(2, java.util.Optional.of(1));
        System.out.println(p2.toString());
    }
    
    public void initData(){
        
    }
}
