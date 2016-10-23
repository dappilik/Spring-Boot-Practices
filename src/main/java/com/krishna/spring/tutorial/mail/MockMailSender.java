package com.krishna.spring.tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

//@Component
public class MockMailSender implements MailSender {
	
	private static final Log log=LogFactory.getLog(MockMailSender.class);

	@Override
	public void send(String to, String subject, String body) {
			log.info("sending mail to "+ to);
			log.info("subject: "+subject);
			log.info("Body: "+body);
	}

}
