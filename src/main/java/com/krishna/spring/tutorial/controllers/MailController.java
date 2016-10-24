package com.krishna.spring.tutorial.controllers;

import javax.mail.MessagingException;

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
	public MailController(MailSender mailSender){
	this.mailSender = mailSender;
	}
	
	
	@RequestMapping("/mail")
	public String sendMail() throws MessagingException
	{
		mailSender.send("dappili.k@live.com", "Java smtp mail2", "You are awsome!!! are you?");
		return "Mail sent";
	}
	
}
