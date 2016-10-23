package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@Value ("${app.name}")
	private String appName;
	private final String template ="hello %s!";
	private final AtomicLong counter =new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="world") String name)
	{
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello from " + appName;
	}
	
}
