package com.ridehailing.backend.strategies.impl;

import java.util.List;

import com.ridehailing.backend.dto.RideRequestDTO;
import com.ridehailing.backend.entities.Driver;
import com.ridehailing.backend.strategies.DriverMatchingStrategy;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

	@Override
	public List<Driver> findMatchingDriver(RideRequestDTO rideRequestDTO) {
		return null;
	}

}
