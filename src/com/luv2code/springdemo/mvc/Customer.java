package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

//this is to learn validation using
//hibernate validator - download the file from
//hibernate website and copy the jar file in dist and lib/requires folders
//to you lib project folder

public class Customer {
	
	
	private String firstName;
	
	@NotNull(message="Last Name Cant Be Empty")
	@Size(min=1, message="Last Name Cant Be Empty")
	private String lastName;
	
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be less than or equal to 10")
	private Integer freePasses;
	
	@NotNull(message="Is Required")
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message="Only Five Chars or Digits")
	private String postalCode;
	

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
