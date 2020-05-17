package com.bleedev.leapyear;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeapYearConsoleAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LeapYearConsoleAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting LeapYear Application...");

		System.out.println("LeapYear Application stopped");
	}

	public boolean checkLeapYear(String inputYear) throws Exception {
		try {
			int validYear = Integer.parseInt(inputYear);
			
		} catch (Exception e) {
			return false;
		}

		return true;
	}
}
