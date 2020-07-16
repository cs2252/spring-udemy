package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		System.out.println("showMyLoginPage controller");
		
		return "fancy-login";
	}
	//add request mapping for access-denied
	@GetMapping("/access-denied")
	public String accessDenied(){
		return "access-denied";
	}
	

}
