package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.ArrayCourseCode;
import com.luv2code.springdemo.mvc.validation.CourseCode;

//this is to learn validation using
//hibernate validator - download the file from
//hibernate website and copy the jar file in dist and lib/requires folders
//to you lib project folder

public class Course {
	
	
	private String firstName;
	
	@NotNull(message="Last Name Cant Be Empty")
	@Size(min=1, message="Last Name Cant Be Empty")
	private String lastName;
	
	//custom annotation
//	@CourseCode
	
//	@CourseCode(value="SHE", message = "Must Start With SHE")
	
	//you can apply the array formatter as well
	@ArrayCourseCode(value={"TOPS", "LUV"}, message="must start with TOPS or LUV")
	private String courseCode;
	

	

	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
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
