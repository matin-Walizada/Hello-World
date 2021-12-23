package com.object;

import java.util.Scanner;

public class DataFromKeyBoard {
	public static void main(String[] args) {
		
		/*
		 * String username; String password;
		 * 
		 * Scanner thecanner = new Scanner(System.in);
		 * 
		 * System.out.println("please log in");
		 * 
		 * System.out.println("enter your user name"); username = thecanner.next();
		 * 
		 * System.out.println("enter your password"); password = thecanner.next();
		 * 
		 * if(username.equals("kamal") && password.equals("123abc") ) {
		 * System.out.println("you have loged in successfully"); }else {
		 * System.out.println("check your credintials"); }
		 */
		
		Integer theNumber1 = new Integer(40);
		Integer theNumber2 = new Integer(60);
		Integer theNumber3 = new Integer(40);
		Integer theNumber4 = new Integer(60);
		if(theNumber1.equals(theNumber3) && theNumber2.equals(theNumber4)) {
			System.out.println("the numbers are equal");
		}else {
			System.out.println("the numbers are not equal");
		}
		

	}

}
