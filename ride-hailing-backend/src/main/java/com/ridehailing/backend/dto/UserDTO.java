package com.ridehailing.backend.dto;

import java.util.Set;

import com.ridehailing.backend.entities.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	private String name;
	private String email;
	private Set<Role> roles;

}
