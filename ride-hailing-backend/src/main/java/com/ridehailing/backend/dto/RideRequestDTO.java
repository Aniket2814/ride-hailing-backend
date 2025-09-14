package com.ridehailing.backend.dto;

import java.time.LocalDateTime;

import org.locationtech.jts.geom.Point;

import com.ridehailing.backend.entities.enums.PaymentMethod;
import com.ridehailing.backend.entities.enums.RideRequestStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDTO {

	private Long id;

	private Point pickupLocation;

	private Point dropOffLocation;

	private LocalDateTime requestedTime;

	private RiderDTO riderDTo;

	private PaymentMethod paymentMethod;

	private RideRequestStatus rideRequestStatus;
}
