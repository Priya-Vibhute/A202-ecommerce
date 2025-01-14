package com.learn.ecommerce.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	private  String id;
	
	private String firstName;
	
	private String lastName;
	
	private String phoneNo;
	
	private int age;
	
	private String password;
	
	private String email;
}
