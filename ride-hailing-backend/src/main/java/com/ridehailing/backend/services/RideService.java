package com.ridehailing.backend.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.ridehailing.backend.dto.RideRequestDTO;
import com.ridehailing.backend.entities.Driver;
import com.ridehailing.backend.entities.Ride;
import com.ridehailing.backend.entities.enums.RideStatus;

public interface RideService {

	Ride getRideById(Long rideId);

	void matchWithDrivers(RideRequestDTO rideRequestDTO);

	Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver);

	Ride updateRideStatus(Long rideId, RideStatus rideStatus);

	Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

	Page<Ride> getAllRidesofDriver(Long driverId, PageRequest pageRequest);
}
