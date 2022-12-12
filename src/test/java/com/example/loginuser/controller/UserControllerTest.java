package com.example.loginuser.controller;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.loginuser.dto.UserDto;

@RunWith(SpringRunner.class)
@SpringBootTest 
class UserControllerTest {
  
	  
	  UserController userController;
	  public UserDto userDto;

	  @Before
	  public void setup() {
	   UserDto userDto = new UserDto();
	    userDto.setEmail("sri@gmail.com");
	    userDto.setPassword("veera@143");
	  }
	  
	  @Test
	  public void registerUser() throws Exception {
		  
		  String actual = userController.loginValid(userDto);
		  String expected =  "Login Successful";
		  
		  assertEquals(expected,actual);;
		  
}

	





}
