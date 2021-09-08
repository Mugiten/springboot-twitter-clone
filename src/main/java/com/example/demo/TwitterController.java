package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterController{
	
	@GetMapping("/")
	public String index() {
		return "Grettings from Spring Boot!";
	}
	
	@GetMapping("/testing")
	public String usemap() {
		return "Mapping is Cool!";
	}
}