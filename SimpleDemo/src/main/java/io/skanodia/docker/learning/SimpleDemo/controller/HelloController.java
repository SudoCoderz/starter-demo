package io.skanodia.docker.learning.SimpleDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(path="/aws/launch")
	public String sayHello()
	{
		return "Congratulation! On your successful launch of your service on aws";
	}

}
