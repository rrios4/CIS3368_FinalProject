package com.CIS3368.FinalProject.DAO;

import com.CIS3368.FinalProject.Models.Orders;

public interface OrderDAO {
    void registerOrderInfo(Orders orders);

    void deleteOrderInfo(String orderId);
}
