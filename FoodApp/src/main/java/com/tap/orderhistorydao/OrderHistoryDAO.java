package com.tap.orderhistorydao;

import java.util.List;

import com.tap.orderhistory.OrderHistory;

public interface OrderHistoryDAO {
    int addOrderHistory(OrderHistory orderHistory);
    List<OrderHistory> getOrderHistory(int user_id);
    List<OrderHistory> getAllOrderHistories();
    void updateOrderHistory(OrderHistory orderHistory);
    void deleteOrderHistory(int orderHistoryId);
}
