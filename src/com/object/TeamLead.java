package com.object;

public class TeamLead {
	
	// Encapsulation
	private String name;
	private int age;

	// getName gives the variable value to you
	public String getName() {
		return name;
	}

	// setName assign the variable value to you
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
 
		// name of our class + aname to our object + = + new + constructor();
		TeamLead devTeamLead = new TeamLead();
		
		// invoked the setter methods and assigned values to our variables
		devTeamLead.setName("Kamal");
		devTeamLead.setAge(25);

		// invoked the getter methods and accessed values to our variables
		System.out.println(devTeamLead.getName());
		System.out.println(devTeamLead.getAge());

	}

}
