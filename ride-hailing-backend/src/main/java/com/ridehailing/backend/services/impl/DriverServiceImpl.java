package com.ridehailing.backend.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ridehailing.backend.dto.DriverDTO;
import com.ridehailing.backend.dto.RideDTO;
import com.ridehailing.backend.dto.RiderDTO;
import com.ridehailing.backend.services.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Override
	public RideDTO acceptRide(Long rideId) {
		return null;
	}

	@Override
	public RideDTO cancelRide(Long rideId) {
		return null;
	}

	@Override
	public RideDTO startRide(Long rideId) {
		return null;
	}

	@Override
	public RideDTO endRide(Long rideId) {
		return null;
	}

	@Override
	public RiderDTO rateRider(Long riderId, Integer rating) {
		return null;
	}

	@Override
	public DriverDTO getMyProfile() {
		return null;
	}

	@Override
	public List<RideDTO> getAllMyRides() {
		return null;
	}

}
