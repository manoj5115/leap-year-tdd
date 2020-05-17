package com.bleedev.leapyear;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeapYearConsoleAppApplicationTests {

	private String year;
	private String invalidYear;
	
	private LeapYearConsoleAppApplication featureObj;
	
	@BeforeEach
	public void contextLoads() {
		featureObj = new LeapYearConsoleAppApplication();
		year = "2000";
		invalidYear = "invalid";
	}

	@Test
	public void isLeapYearValid_True() throws Exception {
		boolean result = featureObj.checkLeapYear(year);
		assertEquals(true, result);
		
	}
	
	@Test
	public void isLeapYearValid_False() throws Exception {
		boolean result = featureObj.checkLeapYear(invalidYear);
		assertEquals(false, result);
		
	}
}
