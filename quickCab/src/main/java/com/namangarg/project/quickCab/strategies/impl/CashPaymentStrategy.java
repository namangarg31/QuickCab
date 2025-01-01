package com.namangarg.project.quickCab.strategies.impl;

//Rider -> 100
//Driver -> 70 Deduct 30Rs from Driver's wallet

import com.namangarg.project.quickCab.entities.Driver;
import com.namangarg.project.quickCab.entities.Payment;
import com.namangarg.project.quickCab.entities.enums.PaymentStatus;
import com.namangarg.project.quickCab.entities.enums.TransactionMethod;
import com.namangarg.project.quickCab.repositories.PaymentRepository;
import com.namangarg.project.quickCab.services.WalletService;
import com.namangarg.project.quickCab.strategies.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CashPaymentStrategy implements PaymentStrategy {

    private final WalletService walletService;
    private final PaymentRepository paymentRepository;

    @Override
    public void processPayment(Payment payment) {
        Driver driver = payment.getRide().getDriver();

        double platformCommission = payment.getAmount() * PLATFORM_COMMISSION;

        walletService.deductMoneyFromWallet(driver.getUser(), platformCommission, null,
                payment.getRide(), TransactionMethod.RIDE);

        payment.setPaymentStatus(PaymentStatus.CONFIRMED);
        paymentRepository.save(payment);
    }
}

//10 ratingsCount -> 4.0
//new rating 4.6
//updated rating
//new rating 44.6/11 -> 4.05
