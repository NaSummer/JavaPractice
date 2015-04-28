package chapter06.lab;

import java.util.Scanner;

public class Question6_13_RandomNumberChooser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program will generate a random number from 1 to 54 excluding the numbers given by user.\nPlease enter the total number of the numbers you want to exclude:");
		int num = sc.nextInt();
		int[] numbers = new int[num];
		System.out.println("Please enter the excluded number:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		int randomNum = getRandom(numbers);
		if (randomNum == 0) {
			System.err.println("Cannot generate the random number because the excluded numbers contain all numbers from 1 to 54.");
		} else {
			System.out.println("The random number generated is: " + randomNum);
		}
	}

	public static int getRandom(int[] numbers) {
		int random;
		boolean isContinue = false;
		boolean[] mark = new boolean[54];
		do {
			isContinue = false;
			random = (int)(Math.random()*54) + 1;
			mark[random-1] = true;
			for (int i = 0; i < numbers.length; i++) {
				if (random == numbers[i]) {
					isContinue = true;
					break;
				}
			}
		} while ((isContinue)&&(!isTryEvery(mark)));
		if (isTryEvery(mark)) {
			return 0;
		} else {
			return random;
		}
	}
	
	public static boolean isTryEvery(boolean[] mark) {
		for (int i = 0; i < mark.length; i++) {
			if (mark[i] == false) {
				return false;
			}
		}
		return true;
	}
	
}
