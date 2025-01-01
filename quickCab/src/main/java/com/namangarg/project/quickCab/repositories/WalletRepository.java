package com.namangarg.project.quickCab.repositories;

import com.namangarg.project.quickCab.entities.User;
import com.namangarg.project.quickCab.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Optional<Wallet> findByUser(User user);
}

