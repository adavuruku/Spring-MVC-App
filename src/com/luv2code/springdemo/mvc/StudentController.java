package com.luv2code.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
	//inject country option from property file
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student theStudent = new Student();
		model.addAttribute("student", theStudent);
		
		// add the country options loaded from property file (countries.properties) to the model 
	    //model.addAttribute("theCountryOptions", countryOptions); 
		
	    return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent ) {
		System.out.println(theStudent.getFirstName() + " " + theStudent.getLastName()+ " " +  theStudent.getCountry());
		return "student-confirmation";
	}
}
