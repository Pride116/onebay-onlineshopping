package com.onebay.onlineShopping.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="tbl_User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long user_Id;
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String password;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;

	
	public Long getUser_Id() {
		return user_Id;
	}


	public void setUser_Id(Long user_Id) {
		this.user_Id = user_Id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public User(Long user_Id, String userName, String firstName, String lastName, String email, String phone,
			String password, Role role) {
		this.user_Id = user_Id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.role = role;
	}


	public User() {}
	

}
