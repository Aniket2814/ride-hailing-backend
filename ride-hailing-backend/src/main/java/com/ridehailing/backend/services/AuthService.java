package com.ridehailing.backend.services;

import com.ridehailing.backend.dto.DriverDTO;
import com.ridehailing.backend.dto.SignUpDTO;
import com.ridehailing.backend.dto.UserDTO;

public interface AuthService {
	String login(String email, String password);

	UserDTO signup(SignUpDTO signUpDTO);

	DriverDTO onbpaordNewDriver(Long userId);
}
