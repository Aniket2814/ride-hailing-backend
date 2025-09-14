package com.ridehailing.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ridehailing.backend.entities.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

}
