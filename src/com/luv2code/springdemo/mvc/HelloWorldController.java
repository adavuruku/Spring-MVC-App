package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * You can also have controller request mapping
 * 
 * this mapping will help to disting all the mapping in the
 * controller from other controllers
 * 
 * with this you canhave same method url mapping in
 * two different controller
 * so the controller mapping will differentiate them
 * 
 * example :- here (HelloWorldController) we have /hellofirst/processForm
 * and in 
 * 
 * HelloWorldControllerTwo we have 
 * 
 * /hellosecond/processForm
 * 
 * same for all other similar methods
 * */
@Controller

@RequestMapping("/hellofirst")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest req, 
			Model model) {
		String theNameString = req.getParameter("studentName").toUpperCase();
//		theNameString = theNameString.toUpperCase();
		
		String resultString = "Yoh ! " + theNameString;
		//add attribute to spring model
		//note you can add more attribute as u desire
		//to the model
		model.addAttribute("message",resultString);
		return "helloworld";
	}
	
	// here we are using @RequestParam binding to map/bind our form fields
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDudeTwo(@RequestParam("studentName") String theNameString, 
			Model model) {
		
		String resultString = "Yohohoh My Friend ! " + theNameString.toUpperCase();
		model.addAttribute("message",resultString);
		
		return "helloworld";
	}
}
