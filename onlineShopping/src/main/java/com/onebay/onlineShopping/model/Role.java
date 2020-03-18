package com.onebay.onlineShopping.model;



import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tbl_role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long role_Id;
	private String role;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "role")
	private List<User> users;

	public Long getRole_Id() {
		return role_Id;
	}

	public void setRole_Id(Long role_Id) {
		this.role_Id = role_Id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Role(Long role_Id, String role, List<User> users) {
		this.role_Id = role_Id;
		this.role = role;
		this.users = users;
	}
	
	public Role() {}


	
	
}
