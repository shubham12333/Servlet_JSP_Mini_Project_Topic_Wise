package com.nt.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.Arithmetic;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void TestWithPositives()
	{
		//create Service Class Object
		Arithmetic ar = new Arithmetic();
		int expected = 30;
		int actual = ar.sum(10,20);
		//perfom testing 
		assertEquals(expected, actual);
	}
	@Test
	public void TestWithNegetives()
	{
		//create Service Class Object
		Arithmetic ar = new Arithmetic();
		int expected = -10;
		int actual = ar.sum(10,-20);
		//perfom testing 
		assertEquals(expected, actual);
	}
	@Test
	public void TestWithZeros()
	{
		//create Service Class Object
		Arithmetic ar = new Arithmetic();
		int expected = 0;
		int actual = ar.sum(0,0);
		//perfom testing 
		assertEquals(expected, actual);
	}
	@Test
	public void TestWithMixed()
	{
		//create Service Class Object
		Arithmetic ar = new Arithmetic();
		int expected = -30;
		int actual = ar.sum(-60,30);
		//perfom testing 
		assertEquals(expected, actual);
	}
}
