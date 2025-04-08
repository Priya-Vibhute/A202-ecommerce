package com.learn.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.ecommerce.dtos.UserDto;
import com.learn.ecommerce.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

	@Autowired
	UserService userService;
	
//	=====================================================================
//	To add user (POST:http://localhost:8080/users)
//	=====================================================================
	@PostMapping
	public ResponseEntity<UserDto> addUser(@Valid @RequestBody UserDto userDto){
		UserDto savedDto = userService.createUser(userDto);
		return new ResponseEntity<UserDto>(savedDto,HttpStatus.CREATED);
	}
	
//	=====================================================================
//			To get all users (GET:http://localhost:8080/users)
//  =====================================================================
	@GetMapping
	public ResponseEntity<List<UserDto>> getAllUsers()
	{
		return new  ResponseEntity<List<UserDto>>(userService.getAllUsers(),HttpStatus.OK);
	}
	
//	=====================================================================
//	To get user by id  (GET:http://localhost:8080/users/78)
//  =====================================================================
	@GetMapping("/{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable String id)
	{
		return new ResponseEntity<UserDto>(userService.getUserById(id),HttpStatus.FOUND);
	}
	
//	=====================================================================
//	To update  user by id  (PUT:http://localhost:8080/users/78)
//  =====================================================================
	@PutMapping("/{id}")
	public ResponseEntity<UserDto> updateUser(@PathVariable String id,@RequestBody UserDto userDto)
	{
		return new ResponseEntity<UserDto>(userService.updateUser(id, userDto),
				                   HttpStatus.OK);
	}
	
//	=====================================================================
//	To delete  user by id  (DELETE:http://localhost:8080/users/78)
//  =====================================================================
	
	@DeleteMapping("/{id}")
	public ResponseEntity<UserDto> deleteUser(@PathVariable String id)
	{
		UserDto userDto = userService.getUserById(id);
		userService.deleteUserById(id);
		return new ResponseEntity<UserDto>(userDto,HttpStatus.OK);
	}
	


}
