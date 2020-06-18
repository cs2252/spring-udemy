package com.luv2code.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		System.out.println("showForm mapping called");
		Student theStudent = new Student();
		theModel.addAttribute("student",theStudent);
		theModel.addAttribute("theCountryOptions", countryOptions);
		System.out.println("before return student-form");
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	//@ModelAttribute("student") Student theStudent 
	public String processForm(@ModelAttribute("student") Student theStudent ) {
		System.out.println("processForm mapping called");
		
		
		return "student-confirmation";
		
	}
}
