package com.example.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private EmailService emailService;
	
	@PostMapping("/register")
	public String registerUser()
	{
		String password=PasswordGenerator.generatePassword(10);
		System.out.println("password is : "+password);
		String email="poojatungatkar68@gmail.com";
		emailService.sendPasswordEmail(email, password);
		return "mail send sucessfully..";
	}
}
