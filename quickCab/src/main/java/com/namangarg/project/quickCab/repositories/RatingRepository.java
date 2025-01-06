package com.namangarg.project.quickCab.repositories;

import com.namangarg.project.quickCab.entities.Driver;
import com.namangarg.project.quickCab.entities.Rating;
import com.namangarg.project.quickCab.entities.Ride;
import com.namangarg.project.quickCab.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByRider(Rider rider);
    List<Rating> findByDriver(Driver driver);

    Optional<Rating> findByRide(Ride ride);
}
