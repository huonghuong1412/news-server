package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.auth.UserDto;
@Service
public interface UserService {
	public UserDto getCurrentUser(Long id);
	
}
