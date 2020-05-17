package com.bleedev.leapyear;

import javax.naming.OperationNotSupportedException;

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

	public boolean checkLeapYear(String year) throws Exception {
		throw new OperationNotSupportedException();
	}
}
