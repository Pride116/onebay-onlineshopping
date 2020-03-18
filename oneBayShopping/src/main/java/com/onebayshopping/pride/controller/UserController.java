package com.onebayshopping.pride.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@Autowired
	private PasswordEncoder encoder;
	
	@GetMapping("/list")
	public List<User> getUsers()
	{
		
		return userRepository.findAll();
	}
	
	@PostMapping("/register")
	public String adduser(@RequestBody User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		
		userRepository.save(user);
		
		return "Hi "+user.getFirstName()+" you have been successfully registered!";
	}
	@GetMapping("/{id}")
	public Optional<User> getUsersByrole(@PathVariable int id)
	{
		
		return userRepository.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteUserById(@PathVariable int id)
	{
		
		userRepository.deleteById(id);
		return "Successfully Deleted!!";
	}
}
