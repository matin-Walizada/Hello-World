package com.object;

public class Student implements Address {

	// injection lose coupling
	public Address address;

	public String address() {
		return address.showAddress();
	}

	// method overrloading

	public int showAge() {

		return 30;
	}

	public int showAge(int age) {

		return 60;
	}

	public double showAge(double age) {

		return age;
	}

	// method emplementatoin and initialization and invoking

	@Override
	public String showAddress() {

		return "mehatin new york 11001, time squre";
	}

	// method emplementatoin
	@Override
	public String showDetails(String name, String Grade) {

		return name + Grade;
	}

	public static void main(String[] args) {

		Student theStudent = new Student();

		// method invoking

		System.out.println(theStudent.showAddress());
		// method invoking and initialzation
		System.out.println(theStudent.showDetails("Zahra", "grade 8"));

	}

}
