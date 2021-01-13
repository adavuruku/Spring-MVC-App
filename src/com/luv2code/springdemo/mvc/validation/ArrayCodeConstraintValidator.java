package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ArrayCodeConstraintValidator implements ConstraintValidator<ArrayCourseCode, String>{

	private String[] coursePrefix;
	
	@Override
    public boolean isValid(String theCode, 
                        ConstraintValidatorContext theConstraintValidatorContext) {
        boolean result = false;
        
        if (theCode != null) {
            
            //
            // loop thru course prefixes
            //
            // check to see if code matches any of the course prefixes
            //
            for (String tempPrefix : coursePrefix) {
                result = theCode.startsWith(tempPrefix);
                
                // if we found a match then break out of the loop
                if (result) {
                    break;
                }
            }
        }
        else {
            result = true;
        }
        
        return result;
  }
	
	public void initialize(ArrayCourseCode theCourseCode) {
		
		coursePrefix = theCourseCode.value();
	}
	
}
 