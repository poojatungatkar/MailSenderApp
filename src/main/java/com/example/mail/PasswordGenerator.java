package com.example.mail;

import java.security.SecureRandom;

public class PasswordGenerator {
	public static String generatePassword(int length)
	{
		String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%";
		SecureRandom random=new SecureRandom();
		StringBuilder password=new StringBuilder(length);
		for(int i=0; i<length;i++)
		{
			password.append(chars.charAt(random.nextInt(chars.length())));
		}
		System.out.println("password is generated...");
		return password.toString();
	}
}
