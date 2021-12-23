package com.object;

public class Employee {

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	String name;
	int age;
	double salary;
	String position;

	// to initialize our fiedls we need for constructor.

	//paramtrized constructor
	//no argument constructor
	
	public Employee(String name, int age, double salary, String position) {

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.position = position;
	}

	public String helpCustomers() {

		return "help them to pay thier doubts";
	}

	public String answerCalls() {

		return "answer the customers calls";
	}

	
	
	
	public static void main(String[] args) {
		// create the object of the employee
		Employee oprator1 = new Employee("Kamal", 25, 20.000, "clark");
		
		
		
		System.out.println("Name: " +  oprator1.name);
		System.out.println("Age: " +oprator1.age);
		System.out.println("Salary: " +oprator1.salary);
		System.out.println("Position: " +oprator1.position);
		
		System.out.println(oprator1.helpCustomers());
		System.out.println(oprator1.answerCalls());
		
		System.out.println("=====================================\n");
		Employee oprator2 = new Employee("Suhila", 24, 30.000, "teamlead");
		
		System.out.println("Name: " +  oprator2.name);
		System.out.println("Age: " +oprator2.age);
		System.out.println("Salary: " +oprator2.salary);
		System.out.println("Position: " +oprator2.position);
		
		System.out.println(oprator1.helpCustomers());
		System.out.println(oprator1.answerCalls());
		
		
		
		
	}

}
