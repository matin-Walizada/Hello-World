package com.object;

public class Jeep {

	String name;
	String model;
	int year;
	String price;
	String copanyName = "Jeep";

	public Jeep(String carName, String carModel, int carYear, String carPrice) {
		name = carName;
		model = carModel;
		year = carYear;
		price = carPrice;
	}
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

		// name of our class + aname for our object + = + new + constructor()
		Jeep myjeep20 = new Jeep("Jeep XR", "Rangular", 2021, "$20.000");
		Jeep myjeep21 = new Jeep("Jeep XL", "Gangular", 2020, "$19.000");
		Jeep myjeep22 = new Jeep("Jeep LE", "Angular", 2019, "$18.000");
		Jeep corola = new Jeep("corola XL", "XLE", 2019, "$18.000");
		System.out.println(myjeep20.name);
		System.out.println(myjeep20.model);
		System.out.println(myjeep20.year);
		System.out.println(myjeep20.price);
		System.out.println(myjeep20.copanyName);

		System.out.println(myjeep20.speedPerMile());
		System.out.println(myjeep20.gassUsage());
		System.out.println(myjeep20.waterUsage());
		
		System.out.println("=============seconde car ================n/");
		
		
		
		System.out.println(myjeep21.name);
		System.out.println(myjeep21.model);
		System.out.println(myjeep21.year);
		System.out.println(myjeep21.price);
		System.out.println(myjeep21.copanyName);

		System.out.println(myjeep21.speedPerMile());
		System.out.println(myjeep21.gassUsage());
		System.out.println(myjeep21.waterUsage());

		System.out.println("=============seconde car ================n/");  
		System.out.println(myjeep22.name);
		System.out.println(myjeep22.model);
		System.out.println(myjeep22.year);
		System.out.println(myjeep22.price);
		System.out.println(myjeep22.copanyName);

		System.out.println(myjeep22.speedPerMile());
		System.out.println(myjeep22.gassUsage());
		System.out.println(myjeep22.waterUsage());
		
	}

}
