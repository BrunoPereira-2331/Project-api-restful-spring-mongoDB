package com.bruno.ProjectApiRestful.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.ProjectApiRestful.domain.User;
import com.bruno.ProjectApiRestful.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
}
