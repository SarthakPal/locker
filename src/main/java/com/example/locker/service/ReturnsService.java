package com.example.locker.service;

import com.example.locker.model.Item;
import com.example.locker.model.Locker;
import com.example.locker.model.LockerStatus;

public class ReturnsService {

    public void returnItemsToLocker(Item item, Locker locker) {
        locker.setLockerStatus(LockerStatus.CLOSED);
    }

}
