package com.namangarg.project.quickCab.repositories;

import com.namangarg.project.quickCab.entities.Rider;
import com.namangarg.project.quickCab.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
    Optional<Rider> findByUser(User user);
}
