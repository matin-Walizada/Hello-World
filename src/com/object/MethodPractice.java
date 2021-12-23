package com.object;

public class MethodPractice {
	public String name = "Kamal";
	
	// access modifier + data type, return type + name of your method + paranthises() + carly braces
	
	private int sum() {
		int number1 = 20;
		int number2 = 40;
		
		return number1 + number2;
		
	}
	
	
	private String showInfo() {
		
		return "ahmad is a student";
	}
	
	
	public static int add(int number1, int number2) {
		
		return number1 + number2;
	}
	
	
	
	void showDetails() {
		
		 String theString = new String();
		System.out.println( theString.concat("his name is " + name));
		
	}
	
	
	

	
	public int showAptNumbers(int apt, int zip) {
		
		return apt + zip;
	}
	
	

	public static void main(String[] args) {
		MethodPractice theNubers = new MethodPractice();
		System.out.println(theNubers.sum());
		System.out.println(theNubers.showInfo());
		System.out.println(add(100, 200));
		theNubers.showDetails();
		
		System.out.println(theNubers.showAptNumbers(60, 1234));
		
		
		
		
	}

}
