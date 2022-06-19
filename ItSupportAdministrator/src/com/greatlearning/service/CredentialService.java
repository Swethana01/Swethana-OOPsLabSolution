package com.greatlearning.service;

import java.io.PrintStream;
import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	public char[] generatePassword() {

		String CapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String SmallLetters = "abcdefghijklmnopqrstuvwxyz";
		String Numbers = "0123456789";
		String SpecialCharacters = "!@#$%^&*+_?',<>";
		String values = CapitalLetters + SmallLetters + Numbers + SpecialCharacters;

		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}

	public String generateEmailAddress(String firstName, String lastName, String Department) {
		return firstName + lastName + "@" + Department + ".abc.com";

	}

	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials as follows");
		System.out.println("Email  --->" + email);
		System.out.println("Password --->" +generatedPassword );
		//System.out.println(generatedPassword);
		
		
		
	}
}