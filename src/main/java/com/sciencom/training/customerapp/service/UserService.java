package com.sciencom.training.customerapp.service;

import com.sciencom.training.customerapp.model.User;

public interface UserService {
	public User getByUsername(String username);
}
