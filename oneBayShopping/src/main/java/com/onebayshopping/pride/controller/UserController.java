package com.onebayshopping.pride.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onebayshopping.pride.model.User;
import com.onebayshopping.pride.repository.UserRepository;

@Controller
@RequestMapping("user")
@CrossOrigin("*")
public class UserController {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/register")
	public String adduser(@RequestBody User user) {
		
		userRepository.save(user);
		
		return "Hi new user you have been successfully registered!";
	}

}
