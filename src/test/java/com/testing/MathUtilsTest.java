package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

	MathUtils mathUtils;
	
	/*
	 * The junit creates new instance for per method by default....we can change it by using 
	 * @TestInstance annotation ......... if the instance is
	 * created per method then afteAll and BeforeAll method needs to be static and
	 * if instance is created per class then it don't need to be static
	 */
	
	@BeforeAll
	void beforeAll()  
	{
		System.out.println("This runs before all tests");
	}
	@BeforeEach
	void init()
	{
		mathUtils = new MathUtils();
		System.out.println("Before Each test object is created");
	}
	
	@AfterEach
	void cleanUp()
	{
		System.out.println("Cleaning up....After each test case");
	}
	
	@AfterAll
	void afterAll()
	{
		System.out.println("This runs after all test cases");
	}
	
	@Test
	void testAdd() {
		
		
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		
		assertEquals(expected,actual,"The add method should add two numbers");
	}
	
	@Test
	public void testComputeCircleArea()
	{
		assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"Should return right circle value");
	}
	
	@Test
	public void testDivideException()
	{
		assertThrows(ArithmeticException.class,() -> mathUtils.divide(1,0),"Should throw Divide by zero Exception");
	}
}
