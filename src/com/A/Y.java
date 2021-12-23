package com.A;



public class Y extends  M{
// access modifiers:  public, private, protected, default
	protected String name = "Kamal";
	protected int add() {
		
		int a = 20;
		int b = 40;
		
		return a + b;
	}
	
	public static void main(String[] args) {
		Y ob = new Y();
		
		System.out.println(ob.name);
		
	}
	
	
}
