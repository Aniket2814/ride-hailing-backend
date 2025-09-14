package com.ridehailing.backend.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ridehailing.backend.dto.RideRequestDTO;
import com.ridehailing.backend.entities.Driver;
import com.ridehailing.backend.entities.Ride;
import com.ridehailing.backend.entities.enums.RideStatus;
import com.ridehailing.backend.services.RideService;

@Service
public class RideServiceImpl implements RideService {

	@Override
	public Ride getRideById(Long rideId) {
		return null;
	}

	@Override
	public void matchWithDrivers(RideRequestDTO rideRequestDTO) {

	}

	@Override
	public Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver) {
		return null;
	}

	@Override
	public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
		return null;
	}

	@Override
	public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
		return null;
	}

	@Override
	public Page<Ride> getAllRidesofDriver(Long driverId, PageRequest pageRequest) {
		return null;
	}

}
