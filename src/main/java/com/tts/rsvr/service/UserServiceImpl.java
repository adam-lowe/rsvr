package com.tts.rsvr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.rsvr.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceInt {

	@Autowired
	private UserRepository userRepository;
	
	// Get All Users
	// Get User By Id
	// Create a User
	// Update User
	// Delete User
	
}