package com.namangarg.project.quickCab.services.impl;

import com.namangarg.project.quickCab.entities.Payment;
import com.namangarg.project.quickCab.entities.Ride;
import com.namangarg.project.quickCab.entities.enums.PaymentStatus;
import com.namangarg.project.quickCab.exceptions.ResourceNotFoundException;
import com.namangarg.project.quickCab.repositories.PaymentRepository;
import com.namangarg.project.quickCab.services.PaymentService;
import com.namangarg.project.quickCab.strategies.PaymentStrategyManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final PaymentStrategyManager paymentStrategyManager;

    @Override
    public void processPayment(Ride ride) {
        Payment payment = paymentRepository.findByRide(ride)
                .orElseThrow(() -> new ResourceNotFoundException("Payment not found for ride with id: "+ride.getId()));
        paymentStrategyManager.paymentStrategy(payment.getPaymentMethod()).processPayment(payment);
    }

    @Override
    public Payment createNewPayment(Ride ride) {
        Payment payment = Payment.builder()
                .ride(ride)
                .paymentMethod(ride.getPaymentMethod())
                .amount(ride.getFare())
                .paymentStatus(PaymentStatus.PENDING)
                .build();
        return paymentRepository.save(payment);
    }

    @Override
    public void updatePaymentStatus(Payment payment, PaymentStatus status) {
        payment.setPaymentStatus(status);
        paymentRepository.save(payment);
    }

}
