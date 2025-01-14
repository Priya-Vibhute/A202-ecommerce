package com.learn.ecommerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "userDetails")
public class User {
	@Id
	private  String id;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable =false,unique=true)
	private String phoneNo;
	
	@Column(nullable = false)
	private int age;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false,unique = true)
	private String email;

}


//@Entity annotation is used to create table
// @Id is used to create primary key
// @table annotation name attribute we use to give table name and 

