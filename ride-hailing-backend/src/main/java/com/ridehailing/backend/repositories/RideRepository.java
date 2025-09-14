package com.ridehailing.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ridehailing.backend.entities.Ride;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {

}
