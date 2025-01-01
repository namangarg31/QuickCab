package com.namangarg.project.quickCab.services.impl;

import com.namangarg.project.quickCab.entities.WalletTransaction;
import com.namangarg.project.quickCab.repositories.WalletTransactionRepository;
import com.namangarg.project.quickCab.services.WalletTransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletTransactionServiceImpl implements WalletTransactionService {

    private final WalletTransactionRepository walletTransactionRepository;
    private final ModelMapper modelMapper;

    @Override
    public void createNewWalletTransaction(WalletTransaction walletTransaction) {
        walletTransactionRepository.save(walletTransaction);
    }

}
