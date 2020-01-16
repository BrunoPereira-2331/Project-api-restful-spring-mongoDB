package com.bruno.ProjectApiRestful.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.ProjectApiRestful.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "maria red", "maria@gmail.com");
		User alex = new User("1", "alex blue", "alex@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));
		//ok() instancia o responseEntity
		return ResponseEntity.ok().body(list);
		
	}
}
