package com.onebayshopping.pride.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onebayshopping.pride.model.Role;
import com.onebayshopping.pride.repository.RoleRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleRepository rolerepo;
	
	@PostMapping("/add")
	public String addRole(@RequestBody Role role)
	{
		rolerepo.save(role);
		
		return "New role "+role.getRole()+" add successfully";
	}
	
	@GetMapping("/list")
	public List<Role> getRoles()
	{
		return rolerepo.findAll();
	}
}
