package com.shiva.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailUtils {

	@Autowired
	private static JavaMailSender mailSender=null;
	
	public EmailUtils(JavaMailSender mailSender) {
		// TODO Auto-generated constructor stub
		
		this.mailSender=mailSender;
	}
	
	public static void sendOtpMail(String recipientEmail,String otp)
	{
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(recipientEmail);
		message.setSubject("Your One-Time Password(OTP)");
		message.setText("Your OTP is :"+otp);
		mailSender.send(message);
	}
	
}
