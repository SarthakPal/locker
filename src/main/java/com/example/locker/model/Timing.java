package com.example.locker.model;

import lombok.Getter;

import java.sql.Time;

@Getter
public class Timing {
    private Time openTime;
    private Time closeTime;

    public Timing(String openTime, String closeTime) {
        this.openTime = Time.valueOf(openTime);
        this.closeTime = Time.valueOf(closeTime);
    }
}
