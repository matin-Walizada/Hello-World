package com.A;

public class VariablesPractice {
	// instance variable
	protected int age = 25;
	// static variables
	private static int bankAcount = 32242;

	// local variables are created inside method

	public static int sum() {

		int number1 = 20;
		int number2 = 60;
		int c = number1 + number2;

		return  c;
	}

	public static void main(String[] args) {
		// we need for object to call instance variables
		VariablesPractice obj = new VariablesPractice();
		System.out.println(obj.age);
		System.out.println(bankAcount);
		 System.out.println(sum());
	}

}
