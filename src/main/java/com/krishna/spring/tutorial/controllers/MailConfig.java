package com.krishna.spring.tutorial.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.krishna.spring.tutorial.mail.MailSender;
import com.krishna.spring.tutorial.mail.MockMailSender;
import com.krishna.spring.tutorial.mail.SmtpMailSender;

@Configuration
public class MailConfig {
	@Bean
	public MailSender mockMailSender() {

		return new MockMailSender();
	}
	
	@Bean
	public MailSender smtpMailSender() {
		return new SmtpMailSender();

	}
	
}
