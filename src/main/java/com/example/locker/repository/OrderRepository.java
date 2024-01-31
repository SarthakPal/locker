package com.example.locker.repository;

import java.util.HashMap;
import java.util.Map;
import com.example.locker.model.Notification;
import com.example.locker.model.Order;

public class OrderRepository {
    public static Map<String, Order> orderMap = new HashMap<>();

    public static Order getOrder(String orderId) {
        return orderMap.get(orderId);
    }
}
