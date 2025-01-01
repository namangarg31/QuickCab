package com.namangarg.project.quickCab.repositories;

import com.namangarg.project.quickCab.entities.Payment;
import com.namangarg.project.quickCab.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByRide(Ride ride);
}

