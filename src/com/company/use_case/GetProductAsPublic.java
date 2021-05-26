package com.company.use_case;

import com.company.exception.PriceException;
import com.company.exception.ProductException;
import com.company.model.*;

import java.util.Optional;

public class GetProductAsPublic {
    private PriceRepository priceRepository;
    private ProductRepository productRepository;

    public GetProductAsPublic(PriceRepository priceRepository, ProductRepository productRepository) {
        this.priceRepository = priceRepository;
        this.productRepository = productRepository;
    }

    public ProductDto getProduct(int productId) throws PriceException, ProductException {
        Optional<Product> product = productRepository.findById(productId);
        if(!product.isPresent()) throw new ProductException("Product not found : "+productId);

        Optional<Price> price = priceRepository.findByProductId(productId);
        if(!price.isPresent()) throw new PriceException("Price not found for the product :"+productId);

        return new ProductDto(product.get(), price.get().getPrice());
    }
}
