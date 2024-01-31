package com.example.locker.model;


import com.example.locker.utils.IdGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Locker {
    private String id;
    private LockerSize lockerSize;
    private String locationId;
    private LockerStatus lockerStatus;

    public Locker(LockerSize lockerSize, String locationId) {
        id = IdGenerator.generateId(8);
        this.lockerSize = lockerSize;
        this.locationId = locationId;
        this.lockerStatus = LockerStatus.AVAILALBE;
    }

}
