package com.onebay.onlineShopping.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="tbl_role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String name;
	
	@ManyToMany(mappedBy = "roles",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<User> users = new HashSet<>();

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	
}
