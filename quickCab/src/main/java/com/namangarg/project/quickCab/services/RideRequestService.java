package com.namangarg.project.quickCab.services;

import com.namangarg.project.quickCab.entities.RideRequest;

public interface RideRequestService {

    RideRequest findRideRequestById(Long rideRequestId);

    void update(RideRequest rideRequest);
}
