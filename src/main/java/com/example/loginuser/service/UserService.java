package com.example.loginuser.service;

import com.example.loginuser.dto.UserDto;

public interface UserService {
	public boolean ValidateUserLogin(UserDto userDto);

	public boolean NewUserRegister(UserDto userDto);

	public boolean PasswordChange(UserDto userDto);
}
