package com.company.use_case;

import com.company.model.SellHistory;
import com.company.model.SellHistoryRepository;

import java.util.*;
import java.util.stream.Collectors;

public class FakeSalesHistories implements SellHistoryRepository {
    List<SellHistory> sales;

    public FakeSalesHistories(){
        sales = new ArrayList<>();
        SellHistory s1 = new SellHistory(1,2, new GregorianCalendar(2021,5,1).getTime());
        SellHistory s2 = new SellHistory(1,3, new GregorianCalendar(2021,5,1).getTime());
        SellHistory s3 = new SellHistory(1,1, new GregorianCalendar(2021,5,1).getTime());
        SellHistory s4 = new SellHistory(1,1, new GregorianCalendar(2021,5,1).getTime());
        SellHistory s5 = new SellHistory(1,1, new GregorianCalendar(2021,5,1).getTime());
        SellHistory s6 = new SellHistory(1,1, new GregorianCalendar(2021,5,1).getTime());
        SellHistory s7 = new SellHistory(1,1, new GregorianCalendar(2021,5,1).getTime());
        sales.add(s1);
        sales.add(s2);
        sales.add(s3);
        sales.add(s4);
        sales.add(s5);
        sales.add(s6);
        sales.add(s7);

    }

    @Override
    public List<SellHistory> findByProductIdAndUserId(int productId, int userId) {
        return sales.stream().filter(s -> s.getProductId() == productId && s.getUserId() == userId).collect(Collectors.toList());
    }

    @Override
    public List<SellHistory> findByProductId(int userId) {
        return sales.stream().filter(s -> s.getUserId() == userId).collect(Collectors.toList());
    }


}
