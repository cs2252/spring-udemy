package com.luv2code.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	@GetMapping("/*")
	public String SillyForm() {
		System.out.println("inside silly controller");
		return "helloworld";
	}

}
