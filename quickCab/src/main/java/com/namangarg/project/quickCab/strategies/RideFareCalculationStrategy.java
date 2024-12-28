package com.namangarg.project.quickCab.strategies;

import com.namangarg.project.quickCab.entities.RideRequest;

public interface RideFareCalculationStrategy {
    double RIDE_FARE_MULTIPLIER = 10;

    double calculateFare(RideRequest rideRequest);
}
