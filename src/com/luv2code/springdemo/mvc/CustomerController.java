package com.luv2code.springdemo.mvc;

import java.util.Map;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
	    return "customer-form";
	}
	

	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult bindingResult) {
		System.out.println(theCustomer.getFirstName() + " " + theCustomer.getLastName());
		System.out.println("Binding Result : " + bindingResult );
		if(!bindingResult.hasErrors()) {
			return "customer-confirmation";
			
		}else {
			return "customer-form";
		}
		
		
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
	}
	
	
	
}
