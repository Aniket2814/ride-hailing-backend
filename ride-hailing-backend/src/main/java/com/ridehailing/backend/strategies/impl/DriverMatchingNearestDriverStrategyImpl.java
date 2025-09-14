package com.ridehailing.backend.strategies.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ridehailing.backend.dto.RideRequestDTO;
import com.ridehailing.backend.entities.Driver;
import com.ridehailing.backend.strategies.DriverMatchingStrategy;

@Service
public class DriverMatchingNearestDriverStrategyImpl implements DriverMatchingStrategy {

	@Override
	public List<Driver> findMatchingDriver(RideRequestDTO rideRequestDTO) {
		return null;
	}

}
