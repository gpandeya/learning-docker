package com.gp.rnd.helloworld.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/greet")
	public String sayHello() {
		return "Hello from Controller!";
	}
	
	@GetMapping("/greet/{name}")
	public String customGreeting(@PathVariable String name) {
		return "Hello, "+name+"!";
	}
}
