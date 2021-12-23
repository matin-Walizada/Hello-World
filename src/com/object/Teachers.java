package com.object;
 

// inheratance tite cop
public class Teachers extends  EmployeesAddress{
 
	
	
	@Override
	public String showAddress() {
	 
		return "The teachers lives in 111 peters st";
	}

	@Override
	public String showDetails(String name, String Grade) {
		 
		return name + Grade ;
	}

	

	public static void main(String[] args) {
		Teachers theTeachers = new Teachers();
		System.out.println(theTeachers.showAddress());
		System.out.println(theTeachers.showDetails("ahmad", "teachs the Grad 8"));
	}

}
