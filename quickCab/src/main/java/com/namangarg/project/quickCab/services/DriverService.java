package com.namangarg.project.quickCab.services;

import com.namangarg.project.quickCab.dto.DriverDto;
import com.namangarg.project.quickCab.dto.RideDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);
    RideDto cancelRide(Long rideId);
    RideDto startRide(Long rideId);
    RideDto endRide(Long rideId);
    RideDto rateRider(Long rideId);
    DriverDto getMyProfile();
    List<RideDto> getAllMyRides();
}
