package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	
	@GetMapping("/")
	public String home() {
		return "Welcome to Jenkins webhook Project!!!";
	}

}
