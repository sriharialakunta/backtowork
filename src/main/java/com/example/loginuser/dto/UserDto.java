package com.example.loginuser.dto;

import javax.persistence.Column;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
	
	private int user_id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false,unique=true)
	private String email;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String phoneNumber;
	
	public UserDto(int user_id, String name, String email, String password, String phoneNumber) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNumber=phoneNumber;
	}
	
	public UserDto() {
		super();
	}
	public UserDto(User user) {
		// TODO Auto-generated constructor stub
		super();
	}
	public UserDto(String name, String email, String password, String phoneNumber) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNumber=phoneNumber;
	}

	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	 
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
