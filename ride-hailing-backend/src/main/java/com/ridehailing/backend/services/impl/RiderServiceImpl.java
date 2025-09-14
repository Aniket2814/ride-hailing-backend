package com.ridehailing.backend.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ridehailing.backend.dto.DriverDTO;
import com.ridehailing.backend.dto.RideDTO;
import com.ridehailing.backend.dto.RideRequestDTO;
import com.ridehailing.backend.dto.RiderDTO;
import com.ridehailing.backend.services.RiderService;

@Service
public class RiderServiceImpl implements RiderService {

	@Override
	public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO) {
		return null;
	}

	@Override
	public RideDTO cancelRide(Long rideId) {
		return null;
	}

	@Override
	public DriverDTO rateDriver(Long rideId, Integer rating) {
		return null;
	}

	@Override
	public RiderDTO getMyProfile() {
		return null;
	}

	@Override
	public List<RideDTO> getAllMyRides() {
		return null;
	}

}
