package com.onebayshopping.pride.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.onebayshopping.pride.model.User;
import com.onebayshopping.pride.repository.UserRepository;

@EnableWebMvc
@CrossOrigin("*")
@RestController
@RequestMapping("user")
public class UserController {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/hello")
	public String hello()
	{
		
		return "im running well";
	}
	
	@PostMapping("/register")
	public String adduser(@RequestBody User user) {
		
		userRepository.save(user);
		
		return "Hi "+user.getFirstName()+" you have been successfully registered!";
	}
	
	
}
