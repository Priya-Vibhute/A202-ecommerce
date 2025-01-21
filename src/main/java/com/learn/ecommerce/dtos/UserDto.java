package com.learn.ecommerce.dtos;

import com.learn.ecommerce.entities.Address;
import com.learn.ecommerce.validators.PasswordMatch;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@PasswordMatch
public class UserDto {

	private  String id;
	
	@NotNull(message = "First Name cannot be nulll")
	@NotBlank(message = "First Name cannot be blank")
	private String firstName;
	
	@NotNull(message = "Last Name cannot be nulll")
	@NotBlank(message = "Last Name cannot be blank")
	private String lastName;
	
	@Pattern(regexp = "^(\\+91|\\+91\\-|0)?[789]\\d{9}$")
	private String phoneNo;
	
	@Min(12)
	@Max(120)
	private int age;
	

	@NotNull(message = "Password cannot be nulll")
	@NotBlank(message = "Password cannot be blank")
	@Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$")
	private String password;
	
	
	private String confirmPassword;
	
	@NotNull(message = "Email cannot be nulll")
	@NotBlank(message = "Email cannot be blank")
	@Pattern(regexp = "^((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$")
	private String email;
	
	private Address address;
}
