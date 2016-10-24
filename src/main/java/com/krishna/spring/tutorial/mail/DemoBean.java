package com.krishna.spring.tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DemoBean {
	
	private static final Log log = LogFactory.getLog(DemoBean.class);
	
	public DemoBean()
	{
		log.info("Demobean created!!");
	}
	
	public String foo()
	{
		return "you are the feel, i dont care pain";
	}
}
