package com.employeeManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/msg")
	public String messenge(){
		return "Hello it is working!";
	}


	@GetMapping("/login")
	public String login() {
		return "login";
	}
	/*
	 * @GetMapping("/") public String home() { return "index"; }
	 */
}