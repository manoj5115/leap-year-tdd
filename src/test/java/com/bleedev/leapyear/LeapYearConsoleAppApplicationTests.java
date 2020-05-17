package com.bleedev.leapyear;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeapYearConsoleAppApplicationTests {

	private String year;
	private String invalidYear;
	private String divisibleBy400;
	private String divisibleBy400Invalid;
	private String divisibleBy100Not400;
	private String divisibleBy4Not100;
	private String nonDivisibleBy4;
	
	private LeapYearConsoleAppApplication featureObj;
	
	@BeforeEach
	public void contextLoads() {
		featureObj = new LeapYearConsoleAppApplication();
		year = "1947";
		invalidYear = "invalid";
		divisibleBy400 = "2000";
		divisibleBy400Invalid = "2001";
		divisibleBy100Not400 = "1700";
		divisibleBy4Not100 = "2012";
		nonDivisibleBy4 = "2019";
		
	}

	@Test
	public void checkLeapYearValid_True() {
		boolean result = featureObj.checkLeapYear(year);
		assertEquals(true, result);
		
	}
	
	@Test
	public void checkLeapYearValid_False() {
		boolean result = featureObj.checkLeapYear(invalidYear);
		assertEquals(false, result);
	}
	
	@Test
	public void checkLeapYearDivisibleBy400() {
		boolean result = featureObj.checkLeapYear(divisibleBy400);
		assertEquals(true, result);
	}
	
	@Test
	public void checkLeapYearDivisibleBy400_Invalid() {
		boolean result = featureObj.checkLeapYear(divisibleBy400Invalid);
		assertEquals(false, result);
	}
	
	@Test
	public void checkLeapYearDivisibleBy100Not400() {
		boolean result = featureObj.checkLeapYear(divisibleBy100Not400);
		assertEquals(false, result);
	}
	
	@Test
	public void checkLeapYearDivisibleBy4Not100() {
		boolean result = featureObj.checkLeapYear(divisibleBy4Not100);
		assertEquals(true, result);
	}
	
	@Test
	public void checkLeapYearNonDivisibleBy4() {
		boolean result = featureObj.checkLeapYear(nonDivisibleBy4);
		assertEquals(false, result);
	}
}
