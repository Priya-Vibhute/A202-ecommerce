package com.learn.ecommerce.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.ecommerce.dtos.UserDto;
import com.learn.ecommerce.entities.User;
import com.learn.ecommerce.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
    @Autowired
	UserRepository userRepository;
    
	@Override
	public UserDto createUser(UserDto userDto) {
//		Generating UUID for userDto object
		String id = UUID.randomUUID().toString();
		userDto.setId(id);
		
//      Conversion(Dto to Entity)
		User user = dtoToEntity(userDto);
	
//		save() method is used to add object into database
		User savedUser = userRepository.save(user);
			
		UserDto savedDto = entityToDto(savedUser);
		
		return savedDto;
	}

	@Override
	public UserDto getUserById(String id) {
		
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		
		return null;
	}

	@Override
	public UserDto updateUser(String id, UserDto userDto) {
		
		return null;
	}

	@Override
	public void deleteUserById(String id) {
		
		
	}

	@Override
	public User dtoToEntity(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setPassword(userDto.getPassword());
		user.setAge(userDto.getAge());
		user.setEmail(userDto.getEmail());
		user.setPhoneNo(userDto.getPhoneNo());
		
		return user;
	}

	@Override
	public UserDto entityToDto(User user) {
		
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLastName());
		userDto.setPassword(user.getPassword());
		userDto.setEmail(user.getEmail());
		userDto.setAge(user.getAge());
		userDto.setPhoneNo(user.getPhoneNo());
		return userDto;
	}

}
