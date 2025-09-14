package com.ridehailing.backend.dto;

import java.time.LocalDateTime;

import org.locationtech.jts.geom.Point;

import com.ridehailing.backend.entities.enums.PaymentMethod;
import com.ridehailing.backend.entities.enums.RideStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideDTO {
	private Long id;

	private Point pickupLocation;

	private Point dropOffLocation;
	/**
	 * Time When Driver Actually Accept Your ride
	 */
	private LocalDateTime createdTime;

	private RiderDTO riderDTO;

	private DriverDTO driverDTO;

	private PaymentMethod paymentMethod;

	private RideStatus rideStatus;

	private Double fare;
	/**
	 * After Putting Otp When ride actually start
	 */
	private LocalDateTime startedAt;

	private LocalDateTime endedAt;

}
