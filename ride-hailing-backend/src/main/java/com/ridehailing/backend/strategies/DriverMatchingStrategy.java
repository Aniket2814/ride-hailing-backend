package com.ridehailing.backend.strategies;

import java.util.List;

import com.ridehailing.backend.dto.RideRequestDTO;
import com.ridehailing.backend.entities.Driver;

public interface DriverMatchingStrategy {
	List<Driver> findMatchingDriver(RideRequestDTO rideRequestDTO);

}
