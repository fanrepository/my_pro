package com.whizen.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whizen.entity.User;
import com.whizen.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService service ;

	@GetMapping(value = "/get/{id}")
	public User get(@PathVariable Integer id) {
		
		return this.service.get(id) ;
	}
	
	
	
}
