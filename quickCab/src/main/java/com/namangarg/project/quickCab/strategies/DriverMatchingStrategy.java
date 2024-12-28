package com.namangarg.project.quickCab.strategies;

import com.namangarg.project.quickCab.dto.RideRequestDto;
import com.namangarg.project.quickCab.entities.Driver;
import com.namangarg.project.quickCab.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
