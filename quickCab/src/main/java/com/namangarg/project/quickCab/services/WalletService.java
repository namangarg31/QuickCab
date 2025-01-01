package com.namangarg.project.quickCab.services;

import com.namangarg.project.quickCab.entities.Ride;
import com.namangarg.project.quickCab.entities.User;
import com.namangarg.project.quickCab.entities.Wallet;
import com.namangarg.project.quickCab.entities.enums.TransactionMethod;

public interface WalletService {

    Wallet addMoneyToWallet(User user, Double amount,
                            String transactionId, Ride ride,
                            TransactionMethod transactionMethod);

    Wallet deductMoneyFromWallet(User user, Double amount,
                                 String transactionId, Ride ride,
                                 TransactionMethod transactionMethod);

    void withdrawAllMyMoneyFromWallet();

    Wallet findWalletById(Long walletId);

    Wallet createNewWallet(User user);

    Wallet findByUser(User user);

}

