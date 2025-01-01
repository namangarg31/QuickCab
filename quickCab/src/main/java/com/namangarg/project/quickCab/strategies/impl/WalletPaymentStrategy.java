package com.namangarg.project.quickCab.strategies.impl;

//Rider had 232, Driver had 500
//Ride cost is 100, commission = 30
//Rider -> 232-100 = 132
//Driver -> 500 + (100 - 30) = 570

import com.namangarg.project.quickCab.entities.Driver;
import com.namangarg.project.quickCab.entities.Payment;
import com.namangarg.project.quickCab.entities.Rider;
import com.namangarg.project.quickCab.entities.enums.PaymentStatus;
import com.namangarg.project.quickCab.entities.enums.TransactionMethod;
import com.namangarg.project.quickCab.repositories.PaymentRepository;
import com.namangarg.project.quickCab.services.WalletService;
import com.namangarg.project.quickCab.strategies.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WalletPaymentStrategy implements PaymentStrategy {

    private final WalletService walletService;
    private final PaymentRepository paymentRepository;

    @Override
    @Transactional
    public void processPayment(Payment payment) {
        Driver driver = payment.getRide().getDriver();
        Rider rider = payment.getRide().getRider();

        walletService.deductMoneyFromWallet(rider.getUser(),
                payment.getAmount(), null, payment.getRide(), TransactionMethod.RIDE);

        double driversCut = payment.getAmount() * (1 - PLATFORM_COMMISSION);

        walletService.addMoneyToWallet(driver.getUser(),
                driversCut, null, payment.getRide(), TransactionMethod.RIDE);

        payment.setPaymentStatus(PaymentStatus.CONFIRMED);
        paymentRepository.save(payment);
    }
}
