package com.namangarg.project.quickCab.dto;

import com.namangarg.project.quickCab.entities.Rider;
import com.namangarg.project.quickCab.entities.enums.PaymentMethod;
import com.namangarg.project.quickCab.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {

    private Long id;

    private Point pickUpLocation;

    private Point dropOffLocation;

    private LocalDateTime requestedTime;

    private RiderDto rider;

    private PaymentMethod paymentMethod;

    private RideRequestStatus rideRequestStatus;

}
