package com.example.locker.service;

import java.util.UUID;

public class CustomerService {
    public String getCustomerIdForOrder(String orderId) {
        return UUID.randomUUID().toString();
    }
}
