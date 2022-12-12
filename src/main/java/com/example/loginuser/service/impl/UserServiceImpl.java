package com.example.loginuser.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.example.loginuser.dto.UserDto;
import com.example.loginuser.entity.User;
import com.example.loginuser.repository.UserRepository;
import com.example.loginuser.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
//	@Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//		new BCryptPasswordEncoder().encode(

	@Override
	public boolean ValidateUserLogin(UserDto userDto) {
		// TODO Auto-generated method stub
		User user=userRepository.findByEmail(userDto.getEmail());
		if(user==null) {
			System.out.println("User not found");
			return false;
		}
		else {
			if(user.getPassword().equals(userDto.getPassword())) {
				System.out.println("Login Successful");
				return true;
			}
			else {
				System.out.println("Invalid Credentials");
				return false;
			}
		}
	}
 
	@Override
	public boolean NewUserRegister(UserDto userDto) {
		// TODO Auto-generated method stub
		User user=null;
		try {
		user=userRepository.findByEmail(userDto.getEmail());
		}
		catch(Exception e) {
		}
		if(user!=null) {
			System.out.println("User already Exists");
			return false;
		}
		User newuser=new User();
		newuser.setName(userDto.getName());
		newuser.setEmail(userDto.getEmail());
		newuser.setPassword(userDto.getPassword());
		newuser.setPhoneNumber(userDto.getPhoneNumber());
		User savedUser=userRepository.save(newuser);
		if(savedUser!=null) {
			System.out.println("New User Created");
			return true;
		}
		else {
			System.out.println("User Creation Failed");
			return false;
		}
	}

	@Override
	public boolean PasswordChange(UserDto userDto) {
		// TODO Auto-generated method stub
		User user=null;
		try {
		user=userRepository.findByEmail(userDto.getEmail());
		}
		catch(Exception e) {
			
		}
		if(user==null) {
			System.out.println("User not found");
			return false;
		}
		else{
			String newPass=userDto.getPassword();
		userRepository.setPassword(newPass,userDto.getEmail());
		}
		return true;
	}
	
	
	
	
	
}
