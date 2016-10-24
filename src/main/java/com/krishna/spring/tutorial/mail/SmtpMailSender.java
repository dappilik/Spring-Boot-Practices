package com.krishna.spring.tutorial.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("smtp")
public class SmtpMailSender implements MailSender {
	
	private static final Log log=LogFactory.getLog(SmtpMailSender.class);

	@Override
	public void send(String to, String subject, String body) throws MessagingException{
		
			MimeMessage message =javaMailSender.createMimeMessage();
			MimeMessageHelper helper;
			
				helper=new MimeMessageHelper(message,true);
			
			helper.setSubject(subject);
			helper.setTo(to);
			helper.setText(body,true);
			log.info("sending SMTP mail to "+ to);
			log.info("subject: "+subject);
			log.info("Body: "+body);
			
			javaMailSender.send(message);
	}
	
	private JavaMailSender javaMailSender;
	public void setJavaMailSender(JavaMailSender javaMailSender) {
	this.javaMailSender = javaMailSender;
	}

}
