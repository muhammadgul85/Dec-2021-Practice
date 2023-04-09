package com.practice.mix.ignore;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MyUnitTest {
	
	@Test
	public void testGetTheStringArray()
	{
		MyUnit myUnit = new MyUnit();
		
		String  expectedArray [] = {"one", "two", "three"};
		
		String resultArray [] = myUnit.getTheStringArray();
		
		assertArrayEquals(expectedArray, resultArray);
		
	}

}
