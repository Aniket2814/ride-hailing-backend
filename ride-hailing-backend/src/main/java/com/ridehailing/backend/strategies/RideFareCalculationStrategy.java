package com.ridehailing.backend.strategies;

import com.ridehailing.backend.dto.RideRequestDTO;

public interface RideFareCalculationStrategy {

	double calculateFare(RideRequestDTO rideRequestDTO);
}
