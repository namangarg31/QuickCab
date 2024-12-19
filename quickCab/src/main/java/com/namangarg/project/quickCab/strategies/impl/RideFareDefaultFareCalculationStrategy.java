package com.namangarg.project.quickCab.strategies.impl;

import com.namangarg.project.quickCab.dto.RideRequestDto;
import com.namangarg.project.quickCab.strategies.RideFareCalculationStrategy;

public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
