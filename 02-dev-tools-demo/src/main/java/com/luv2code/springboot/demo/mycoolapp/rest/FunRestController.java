package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayHello() {
		return "hello world! current time on the server is "+LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "run a hard 5K";
	}
	
	@GetMapping("/fortune")
	public String getdailyFortune() {
		return "Today is your lucky day!";
	}
	
}
