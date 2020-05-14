package com.onebay.onlineShopping.model.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onebay.onlineShopping.model.User;

import com.onebay.onlineShopping.repository.UserRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {


	@Autowired
	private UserRepository userrepo;
	
	/*@Autowired
	private PasswordEncoder encoder;
	
	@PostMapping("/register")
	public String register(@RequestBody User user)
	{
		if(user!=null)
		user.setPassword(encoder.encode(user.getPassword()));
		userrepo.save(user);
		return "Hi "+user.getFirstName()+" you are successfully registered ";
	}*/
	
	@GetMapping("/list")
	public List<User> getUsers(){
		return userrepo.findAll();
	}
	
	@GetMapping("/list/{id}")																									
	public Optional<User> getUserById(@PathVariable Long id){
		
		return userrepo.findById(id);
	}
	@PatchMapping("/update")
	public String update(User user)
	{
		//user.setPassword(encoder.encode(user.getPassword()));
		userrepo.save(user);
		return "Hi "+user.getFirstName()+" you are successflly updated ";
	}
	
}
