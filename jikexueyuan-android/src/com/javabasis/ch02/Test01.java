package com.javabasis.ch02;

public class Test01 {
	
	/**
	 * (sprt(20)+sqrt(10))/(sqrt(20)-sqrt(10))
	 * @param args
	 */
	public static void main(String[] args) {
		//way01
		System.out.println("(sprt(20)+sqrt(10))/(sqrt(20)-sqrt(10))=" + 
			Math.round( (Math.sqrt(20)+Math.sqrt(10)) /
					    (Math.sqrt(20)-Math.sqrt(10)) *10) / 10.0 );
		
		//way02: clearer, the result is the same.
		double sqrt20 = Math.sqrt(20);
		double sqrt10 = Math.sqrt(10);
		double result = (sqrt20+sqrt10)/(sqrt20-sqrt10);
		result = Math.round(result*10)/10.0;
		System.out.println("(sprt(20)+sqrt(10))/(sqrt(20)-sqrt(10))=" + result);
		
	}

}
