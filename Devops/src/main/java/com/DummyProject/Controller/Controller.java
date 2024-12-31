package com.DummyProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping("/greet")
	String Hello() {
		return "Hello";
	}
	
	
}
