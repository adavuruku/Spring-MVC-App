package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix;
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstrain) {
		
		boolean result = false;
		if(theCode !=null) {
			result = theCode.startsWith(coursePrefix);
		}
		return result;
	}
	
	public void initialize(CourseCode theCourseCode) {
		
		coursePrefix = theCourseCode.value();
	}
	
}
 