package com.company.model;

import java.util.List;

public interface SellHistoryRepository {
    List<SellHistory> findByProductIdAndUserId(int productId, int userId);

    List<SellHistory> findByUserId(int userId);
}
