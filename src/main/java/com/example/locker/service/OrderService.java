package com.example.locker.service;

import com.example.locker.model.Item;
import com.example.locker.model.Order;
import com.example.locker.repository.OrderRepository;

import java.util.List;

public class OrderService {

    OrderRepository orderRepository = new OrderRepository();

    public Order getOrder(String orderId) {
        return orderRepository.getOrder(orderId);
    }

    public List<Item> getItemsForOrder(String orderId) {
        return orderRepository.getOrder(orderId).getItems();
    }

    public void initiateRefund(String orderId) {
        System.out.printf("Refund for order %s initiated", orderId);
    }

}
