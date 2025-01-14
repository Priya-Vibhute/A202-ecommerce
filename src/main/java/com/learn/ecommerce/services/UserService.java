package com.learn.ecommerce.services;

import java.util.List;

import com.learn.ecommerce.dtos.UserDto;
import com.learn.ecommerce.entities.User;

public interface UserService {
//	To add user
	UserDto createUser(UserDto userDto);

//	To get user by id
	UserDto getUserById(String id);

//	To get all users
	List<UserDto> getAllUsers();

//	To update user by id
	UserDto updateUser(String id,UserDto userDto);
	
//  To delete user By id
	void deleteUserById(String id);

//	 dto to entity
	User dtoToEntity(UserDto userDto);

//   entity to dto
	UserDto entityToDto(User user);


}
