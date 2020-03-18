package com.onebayshopping.pride.model;



import java.util.List;

import javax.persistence.*;

//import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int role_Id;
	private String role;
	@JsonManagedReference
	@OneToMany(mappedBy = "role",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<User> users;

	

	public Role(int role_Id, String role, List<User> users) {
		
		this.role_Id = role_Id;
		this.role = role;
		this.users = users;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Role() {
	
	}

	public int getRole_Id() {
		return role_Id;
	}

	public void setRole_Id(int role_Id) {
		this.role_Id = role_Id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	
}
