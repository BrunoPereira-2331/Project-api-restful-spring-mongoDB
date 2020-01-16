package com.bruno.ProjectApiRestful.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.bruno.ProjectApiRestful.domain.User;
import com.bruno.ProjectApiRestful.repository.UserRepository;

@Configuration
public class Instatiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		User maria = new User(null, "Mario red", "Mario@gmail.com");
		User alex = new User(null, "Luigi Green", "Luigi@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
	}

}
