package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystem;
	
	
	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	private LinkedHashMap<String, String> countryList; 
	
	

	
	public Student() {
		countryList = new LinkedHashMap<>();
		countryList.put("NG", "Nigeria");
		countryList.put("GH", "Ghana");
		countryList.put("SA", "South Africa");
		countryList.put("IT", "Italy");
		countryList.put("ENG", "England");
		countryList.put("USA", "United State OF America");
	}

	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
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
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
