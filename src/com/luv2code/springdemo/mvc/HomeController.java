package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @Controller extend @Component Annotation
 * so its loaded on component scan as well
 * */
@Controller
public class HomeController {
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
}
