package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need a controller method to show initial html form
	@RequestMapping("/showForm")
	public String showForm() {
		System.out.println("inside show-form mapping");
		return "Helloworld-form";
	}
	
	
	//need a controller method to process html form
	@RequestMapping("/processForm")
	public String processForm() {
		System.out.println("inside Processform mapping");
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		String theName=request.getParameter("studentName");
		theName=theName.toUpperCase();
		String message="Yo! "+theName;
		model.addAttribute("message",message);
		return "helloworld";
	}

	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,
				Model model) {
		
//		String theName=request.getParameter("studentName");
		theName=theName.toUpperCase();
		String message="Requestparam "+theName;
		model.addAttribute("message",message);
		return "helloworld";
	}
}
