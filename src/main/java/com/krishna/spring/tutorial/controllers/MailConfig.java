package com.krishna.spring.tutorial.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.krishna.spring.tutorial.mail.MailSender;
import com.krishna.spring.tutorial.mail.MockMailSender;
import com.krishna.spring.tutorial.mail.SmtpMailSender;

@Configuration
public class MailConfig {
	@Bean
	@Profile("dev")
	public MailSender mockMailSender() {

		return new MockMailSender();
	}
	
	@Bean
	@Profile("!dev")
	public MailSender smtpMailSender() {
		return new SmtpMailSender();

	}
	
}
