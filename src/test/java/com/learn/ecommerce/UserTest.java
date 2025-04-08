package com.learn.ecommerce;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import com.learn.ecommerce.entities.User;
import com.learn.ecommerce.repositories.UserRepository;

@SpringBootTest
public class UserTest {
	
	@MockitoBean
	private UserRepository userRepository;
	
	private User user;
	
	@BeforeEach
	void setUp()
	{
		user=new User();
		user.setId("U123");
    	user.setFirstName("Nisha");
    	user.setLastName("Sharma");
    	user.setEmail("testUser@gmail.com");
    	user.setAge(19);
    	user.setPhoneNo("8974512343");
    	user.setPassword("User@1234");
    	Optional<User> optionalUser = Optional.of(user);
    	Mockito.when(userRepository.findById("U123")).thenReturn(optionalUser);
	}
	
	@Test
    void testCreateUser()
    {
    	User user = new User();
    	user.setId("U123");
    	user.setFirstName("Nisha");
    	user.setLastName("Sharma");
    	user.setEmail("testUser@gmail.com");
    	user.setAge(19);
    	user.setPhoneNo("8974512343");
    	user.setPassword("User@1234");
    	
    	Mockito.when(userRepository.save(user)).thenReturn(user);
    	
    	User savedUser = userRepository.save(user);
    	assertNotNull(savedUser);
    	assertEquals("Nisha", savedUser.getFirstName());
    	
    }
	
	@Test
	void testUpdateUser()
	{
		String firstName = user.getFirstName();
		user.setFirstName("UpdatedName");
		Mockito.when(userRepository.save(user)).thenReturn(user);
		User updatedUser = userRepository.save(user);
		assertNotEquals(firstName, updatedUser.getFirstName());
		
	}
	
	@Test
	void testDeleteUser()
	{
		userRepository.deleteById("U123");
		Mockito.verify(userRepository).deleteById("U123");
		Mockito.when(userRepository.existsById("U123")).thenReturn(false);
		assertFalse(userRepository.existsById("U123"));
	}
	
	@Test
	void testGetUser()
	{
//		testUser@gmail.com
		Mockito.when(userRepository.findById("U123")).thenReturn(Optional.of(user));
		User foundUser = userRepository.findById("U123").get();
		assertEquals("testUser@gmail.com", foundUser.getEmail());
		
	}
	
	

}
