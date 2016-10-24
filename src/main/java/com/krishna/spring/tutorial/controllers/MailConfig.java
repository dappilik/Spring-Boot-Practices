package com.krishna.spring.tutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;

import com.krishna.spring.tutorial.mail.DemoBean;
import com.krishna.spring.tutorial.mail.MailSender;
import com.krishna.spring.tutorial.mail.MockMailSender;
import com.krishna.spring.tutorial.mail.SmtpMailSender;

@Configuration
public class MailConfig {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Bean
	//@Profile("dev")
	@ConditionalOnProperty(name="spring.mail.host",
							havingValue="foo",
							matchIfMissing=true)
	public MailSender mockMailSender() {

		return new MockMailSender();
	}
	
	@Bean
	//@Profile("!dev")
	@ConditionalOnProperty("spring.mail.host")
	public MailSender smtpMailSender() {
		demoBean().foo();
		SmtpMailSender mailSender = new SmtpMailSender();
		mailSender.setJavaMailSender(javaMailSender);
		return mailSender;

	}
	
	@Bean
	public DemoBean demoBean()
	{
		return new DemoBean();
	}
	
}
