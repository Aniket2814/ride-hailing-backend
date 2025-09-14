package com.ridehailing.backend.services.impl;

import org.springframework.stereotype.Service;

import com.ridehailing.backend.dto.DriverDTO;
import com.ridehailing.backend.dto.SignUpDTO;
import com.ridehailing.backend.dto.UserDTO;
import com.ridehailing.backend.services.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

	@Override
	public String login(String email, String password) {
		return null;
	}

	@Override
	public UserDTO signup(SignUpDTO signUpDTO) {
		return null;
	}

	@Override
	public DriverDTO onbpaordNewDriver(Long userId) {
		return null;
	}

}
