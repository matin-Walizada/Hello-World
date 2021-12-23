package com.object;

public class Birds {

	String name;
	String outerCover;
	String beak;
	String feet;
	String color;

	public Birds(String name, String outerCover, String beak, String feet, String color) {

		this.name = name;
		this.outerCover = outerCover;
		this.beak = beak;
		this.feet = feet;
		this.color = color;
	}

	public String flyHigh() {

		return "fleys 10 thusand feet high";
	}

	public String food() {

		return "seed";
	}

	@Override
	public String toString() {
		return "Birds [name=" + name + ", outerCover=" + outerCover + ", beak=" + beak + ", feet=" + feet + ", color="
				+ color + ", flyHigh()=" + flyHigh() + ", food()=" + food() + "]";
	}

	public static void main(String[] args) {

		// name of the class + name of our object = + new + constractor();
		Birds eagle = new Birds("Bald Eagle", "feather", "long and shapr", "two feet", "Gray");
		System.out.println(eagle);

		Birds turkey = new Birds("Turkey", "feather", "long and shapr", "two feet", "White");
		System.out.println(turkey);

		Birds sparrow = new Birds("Sparrow", "feather", "short", "two feet", "brown");
		System.out.println(sparrow);

	}

}
