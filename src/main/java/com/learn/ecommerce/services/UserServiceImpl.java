package com.learn.ecommerce.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.ecommerce.dtos.UserDto;
import com.learn.ecommerce.entities.User;
import com.learn.ecommerce.exceptions.IdNotFoundException;
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
		Optional<User> user = userRepository.findById(id);
	
		User fetchedUser = user.orElseThrow(()->new IdNotFoundException("Id not found"));
		
		return entityToDto(fetchedUser);
	}

	@Override
	public List<UserDto> getAllUsers() {
		
		//It will return all objects stored in user table
	    List<User> users = userRepository.findAll();
	    
	  
	    List<UserDto> userDtoList = users.stream()
	    .map((user)->entityToDto(user))
	    .collect(Collectors.toList());
	    
				
		return userDtoList;
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
