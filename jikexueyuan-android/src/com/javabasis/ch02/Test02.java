package com.javabasis.ch02;

public class Test02 {
	/**
	 * Hi, everybody! I'm Ball. I'm 18 years old and 1.68 meters tall. I'm a wild man.
	 * Hi, everybody! I'm Amy. I'm 17 years old and 1.59 meters tall. I'm a quiet lady.
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "Ball";
		String gender = "man";
		byte age = 18;
		float height = 1.68f;
		String type = "wild";
		System.out.println( "Hi, everybody! " +
							"I'm " + name + ". " +
							"I'm " + age + " years old and " + height + " meters tall. " +
							"I'm a " + type + " " + gender + ".");
		
		name = "Amy";
		gender = "lady";
		age = 17;
		height = 1.59f;
		type = "quiet";
		System.out.println( "Hi, everybody! " + 
							"I'm " + name + ". " +
							"I'm " + age + " years old and " + height + " meters tall. " +
							"I'm a " + type + " " + gender + ".");
		
	}

}
