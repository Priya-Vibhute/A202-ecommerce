package com.learn.ecommerce;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EcommerceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testAdd()
	{
		
		Calculator calculator = new Calculator();
		int actualResult = calculator.add(12, 2);
		int expectedResult=140;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testSub()
	{
		assertEquals(9, new Calculator().sub(5, 5));
	}
	
	@Test
	void testIsEven()
	{
		assertTrue(new Calculator().isEven(6));
		assertFalse(new Calculator().isEven(15));
	}
	
	@Test
	void testCountOfPrime()
	{
		  assertEquals(25, new Calculator().countOfPrime());
		
	}
	
	

}
