package com.ridehailing.backend.services;

import java.util.List;

import com.ridehailing.backend.dto.DriverDTO;
import com.ridehailing.backend.dto.RideDTO;
import com.ridehailing.backend.dto.RiderDTO;

public interface DriverService {

	RideDTO acceptRide(Long rideId);

	RideDTO cancelRide(Long rideId);

	RideDTO startRide(Long rideId);

	RideDTO endRide(Long rideId);

	RiderDTO rateRider(Long riderId, Integer rating);

	DriverDTO getMyProfile();

	List<RideDTO> getAllMyRides();
}
