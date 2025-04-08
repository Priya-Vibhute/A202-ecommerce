package com.learn.ecommerce;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.learn.ecommerce.controllers.UserController;
import com.learn.ecommerce.dtos.UserDto;
import com.learn.ecommerce.services.UserService;

@WebMvcTest(controllers = UserController.class)
public class UserControllerTest {
	
	@MockitoBean
	private UserService userService;
	
	@Autowired
	private MockMvc mockMvc;
	
	
//	users/{id}    users/101
	
	@Test
	public void testGetUserById() throws Exception
	{
		UserDto userDto = new UserDto();
		userDto.setId("101");
		userDto.setFirstName("Nisha");
		userDto.setLastName("Sharma");
		userDto.setPassword("XYZ@123");
		userDto.setConfirmPassword("XYZ@123");
		userDto.setAge(20);
		
		Mockito.when(userService.getUserById("101")).thenReturn(userDto);
		mockMvc
		.perform(get("/users/101"))
		.andExpect(status().isFound()
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				);
		
				
	}
	
	
	

}
