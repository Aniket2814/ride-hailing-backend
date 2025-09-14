package com.ridehailing.backend.services;

import java.util.List;

import com.ridehailing.backend.dto.DriverDTO;
import com.ridehailing.backend.dto.RideDTO;
import com.ridehailing.backend.dto.RideRequestDTO;
import com.ridehailing.backend.dto.RiderDTO;

public interface RiderService {
	RideRequestDTO requestRide(RideRequestDTO rideRequestDTO);

	RideDTO cancelRide(Long rideId);

	DriverDTO rateDriver(Long rideId, Integer rating);

	RiderDTO getMyProfile();

	List<RideDTO> getAllMyRides();
}
