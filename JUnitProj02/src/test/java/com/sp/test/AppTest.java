package com.sp.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sp.service.BankService;


public class AppTest 
{
	private static BankService bankservice;
	
	@BeforeAll
	public static void setUp()
	{
		System.out.println("AppTest.setUp()");
		bankservice = new BankService();
	}
	
	@BeforeEach
	public  void BeforeTest()
	{
		System.out.println("AppTest.BeforeTest()");
	}
	
	@Test
	public void testCalcInterestWithBigValues()
	{
		double excepted = 120000.0f;
		double actual = bankservice.calcInterestAmount(1200000,10,1);
		assertEquals(excepted,actual);
	}
	@Test
	public void testCalcInterestWithSmallValues()
	{
		double excepted = 900.0f;
		double actual = bankservice.calcInterestAmount(9000,10,1);
		assertEquals(excepted,actual);
	}
	@Test
	public void testCalcInterestWithZeroValues()
	{
		double excepted = 10.0f;
		double actual = bankservice.calcInterestAmount(100.0,10.0,1.0);
		assertEquals(excepted,actual);
	}
	@AfterEach
	public void afterTest()
	{
		System.out.println("AppTest.afterTest()");
	}
	@AfterAll
	public static void afterAll()
	{
		System.out.println("AppTest.afterAll()");
	}
}
