package com.krishna.spring.tutorial.mail;

public interface MailSender {
	void send(String to,String subject,String body);
	
}
