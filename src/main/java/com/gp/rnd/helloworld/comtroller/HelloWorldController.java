package com.gp.rnd.helloworld.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/greet")
	public String sayHello() {
		return "Hello from Controller!";
	}
}
