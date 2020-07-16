package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String landingPage() {
		return "landing";
	}
	
	@GetMapping("/employees")
	public String showHome() {
		System.out.println("home controller");
		return "home1";
	}
	
	
	//add mapping for leaders
	@GetMapping("/leaders")
	public String leaders() {
		return "leaders";
	}
	
	//add mapping for systems
	@GetMapping("/systems")
	public String systems() {
		return "systems";
	}
}
