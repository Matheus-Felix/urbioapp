package com.urbioapp.api.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbioapp.api.models.User;
import com.urbioapp.api.repository.UserRepository;
import com.urbioapp.api.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User persistir(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}
	
}	