package com.namangarg.project.quickCab.strategies.impl;

import com.namangarg.project.quickCab.entities.Driver;
import com.namangarg.project.quickCab.entities.RideRequest;
import com.namangarg.project.quickCab.repositories.DriverRepository;
import com.namangarg.project.quickCab.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearbyTopRatedDrivers(rideRequest.getPickupLocation());
    }
}
