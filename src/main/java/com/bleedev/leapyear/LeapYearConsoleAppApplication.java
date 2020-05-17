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

	public boolean checkLeapYear(String inputYear) {
		try {
			int validYear = Integer.parseInt(inputYear);

			boolean divisible400 = validYear % 400 == 0;
			
			boolean divisible4 = validYear % 4 == 0;
			
			boolean divisible100 = validYear % 100 == 0;
			
			if(!divisible4) {
				return false;
			}
			else if(!divisible100) {
				return true;
			}
			else if(!divisible400){
				return false;
			}
			else {
				return true;
			}

		} catch (Exception e) {
			return false;
		}
	}
}
