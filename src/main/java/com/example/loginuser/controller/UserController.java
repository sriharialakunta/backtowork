 package com.example.loginuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginuser.dto.UserDto;
import com.example.loginuser.service.UserService;
@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/login")
	public String loginValid(@RequestBody UserDto userDto) throws Exception {
		if(userService.ValidateUserLogin(userDto))
			 
			return "Login Successful"; 
		else
			return "Invalid Credentials";
	}
	 
	@PostMapping("/register")
	@CrossOrigin(origins = "http://localhost:3000")
	public String  registerUser(@RequestBody UserDto userDto) throws Exception{
		if(userService.NewUserRegister(userDto))
			return "User Created Successful";
		else
			return "Email Already Exists,Try with another email";
	}
	
	@PutMapping("/forgot")
	public String changePassword(@RequestBody UserDto userDto) throws Exception{
		if(userService.PasswordChange(userDto))
			return "Password Changed Sucessfully";
		else
			return "Password Change Failed"; 
	}
	
}
