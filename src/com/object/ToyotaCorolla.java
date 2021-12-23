package com.object;

public class ToyotaCorolla {

	public String name = "Corrolla";
	public String model = "XL";
	public int year = 2021;
	public String price = "$20.000";
	public String color = "black";

	public String speedPerMile() {

		return "250 MPH";
	}

	public String gassUsage() {

		return "50 MPG";
	}

	public String waterUsage() {

		return "every 3 months 5 Gallons of water";
	}

	
	
	public static void main(String[] args) {
		// name of our class + aname for our object + = + new + constractor();
		
		ToyotaCorolla corolla2021 = new ToyotaCorolla();
		
		System.out.println(corolla2021.name);
		System.out.println(corolla2021.model);
		System.out.println(corolla2021.year);
		System.out.println(corolla2021.price);
		System.out.println(corolla2021.color);
		
		System.out.println(corolla2021.speedPerMile());
		System.out.println(corolla2021.gassUsage());
		System.out.println(corolla2021.waterUsage());

	}

}
