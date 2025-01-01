package com.namangarg.project.quickCab.services;

import com.namangarg.project.quickCab.entities.Payment;
import com.namangarg.project.quickCab.entities.Ride;
import com.namangarg.project.quickCab.entities.enums.PaymentStatus;

public interface PaymentService {
    void processPayment(Ride ride);

    Payment createNewPayment(Ride ride);

    void updatePaymentStatus(Payment payment, PaymentStatus status);
}
