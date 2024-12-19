package com.namangarg.project.quickCab.services;

import com.namangarg.project.quickCab.dto.RideRequestDto;
import com.namangarg.project.quickCab.entities.Driver;
import com.namangarg.project.quickCab.entities.Ride;
import com.namangarg.project.quickCab.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {
    Ride getRideById(Long rideId);
    void matchWithDrivers(RideRequestDto rideRequestDto);
    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);
    Ride updateRideStatus(Long rideId, RideStatus rideStatus);
    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);
    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);
}
