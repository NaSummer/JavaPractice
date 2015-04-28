/*
 * Use the Random class) Write a program that creates a Random object with seed
1000 and displays the first 50 random integers between 0 and 100 using the
nextInt(100) method.
 */

package chapter08.lab;

import java.util.Random;

public class Question08_04_UseTheRandomClass {
	
	public static void main(String[] args) {
		Random random = new Random(1000L);
		for (int i = 0; i < 50; i++) {
			System.out.println((i+1) + ":\t" + random.nextInt(100));
		}
	}

}
