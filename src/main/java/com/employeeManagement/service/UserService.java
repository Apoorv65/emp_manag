package com.employeeManagement.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.employeeManagement.dto.UserRegistrationDto;
import com.employeeManagement.model.User;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}