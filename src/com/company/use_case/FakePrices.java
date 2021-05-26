package com.company.use_case;

import com.company.model.Price;
import com.company.model.PriceRepository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class FakePrices implements PriceRepository {
    Map<Integer, Price> prices;
    
    public FakePrices(){
        prices = new HashMap<>();
        
        LocalDate date1 = LocalDate.of(2020, 5, 5);
        Price price = new Price(1, date1, 26.00);
        Price price2 = new Price(2, date1, 50.00);
        Price price3 = new Price(3, date1, 45.00);
        prices.put(1, price);
        prices.put(2, price2);
        prices.put(3, price3);        
        
    }

    @Override
    public Price findByProductId(int id) {
        return prices.get(id);
    }
}
