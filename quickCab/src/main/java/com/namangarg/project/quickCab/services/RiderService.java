package com.namangarg.project.quickCab.services;

import com.namangarg.project.quickCab.dto.DriverDto;
import com.namangarg.project.quickCab.dto.RideDto;
import com.namangarg.project.quickCab.dto.RideRequestDto;
import com.namangarg.project.quickCab.dto.RiderDto;
import com.namangarg.project.quickCab.entities.Rider;
import com.namangarg.project.quickCab.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface RiderService {
    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
