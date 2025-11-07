package com.example.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	//predefine interface
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendPasswordEmail(String toEmail, String password)
	{
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(toEmail);
		message.setSubject("Your Auto Generated Password");
		message.setText("Hello,\n\n Your new password is : "+password+"\n\n please change it after login.");
		message.setFrom("poojatungatkar8@gmail.com");
		javaMailSender.send(message);
	}
}
