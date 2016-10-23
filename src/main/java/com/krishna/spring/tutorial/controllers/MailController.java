package com.krishna.spring.tutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.spring.tutorial.mail.MailSender;

@RestController
public class MailController {
	//@Resource()
	private MailSender mailSender ;//=new MockMailSender() ;
	
	@Autowired
	public MailController(@Qualifier("mockMailSender") MailSender mailSender) {
	this.mailSender = mailSender;
	}
	
	
	@RequestMapping("/mail")
	public String sendMail()
	{
		mailSender.send("abc@example.com", "some subject", " some body");
		return "Mail sent";
	}
	
}
