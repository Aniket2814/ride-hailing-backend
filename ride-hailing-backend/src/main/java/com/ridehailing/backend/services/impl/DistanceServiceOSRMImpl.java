package com.ridehailing.backend.services.impl;

import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

import com.ridehailing.backend.services.DistanceService;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {

	@Override
	public double calculateDistance(Point source, Point destination) {

		return 0;
	}

}
