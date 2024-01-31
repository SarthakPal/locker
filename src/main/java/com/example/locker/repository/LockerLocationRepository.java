package com.example.locker.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.example.locker.model.LockerLocation;

public class LockerLocationRepository {
    public static List<LockerLocation> lockerLocations = new ArrayList<>();

    public static LockerLocation getLockerLocation(String locationId) {
        Optional<LockerLocation> lockerLocation =
                lockerLocations.stream()
                        .filter(ll -> ll.getLocationId().equals(locationId)).findFirst();
        if (lockerLocation.isPresent())
            return lockerLocation.get();
        return null;
    }
}
