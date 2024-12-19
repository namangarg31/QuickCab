package com.namangarg.project.quickCab.strategies;

import com.namangarg.project.quickCab.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}
