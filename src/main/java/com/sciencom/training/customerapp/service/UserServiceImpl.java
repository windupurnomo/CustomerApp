package com.sciencom.training.customerapp.service;

import org.springframework.stereotype.Service;

import com.sciencom.training.customerapp.model.User;

@Service
public class UserServiceImpl implements UserService{

	public User getByUsername(String username) {
		User u = new User();
		u.setUsername("windu");
		u.setPassword("windu");
		return u;
	}

}
