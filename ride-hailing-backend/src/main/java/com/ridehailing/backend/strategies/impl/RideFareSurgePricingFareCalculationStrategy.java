package com.ridehailing.backend.strategies.impl;

import com.ridehailing.backend.dto.RideRequestDTO;
import com.ridehailing.backend.strategies.RideFareCalculationStrategy;

public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {

	@Override
	public double calculateFare(RideRequestDTO rideRequestDTO) {
		return 0;
	}

}
