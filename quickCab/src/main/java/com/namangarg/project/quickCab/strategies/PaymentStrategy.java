package com.namangarg.project.quickCab.strategies;

import com.namangarg.project.quickCab.entities.Payment;

public interface PaymentStrategy {
    Double PLATFORM_COMMISSION = 0.3;
    void processPayment(Payment payment);

}
