package com.company.model;

import java.util.List;

public interface SellHistoryRepository {
    public SellHistory findByProductIdAndUserId(int id);

    public List<SellHistory> findByProductIdAndUserId(int productId, int userId);
}
