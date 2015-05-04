package assignment4;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

class DivisibleBy2Or3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ask for the number of numbers
		System.out.println("How many numbers do you want?");
		long numOfNum = sc.nextLong();
		Random random = new Random(System.currentTimeMillis());

		// output loop
		while (numOfNum > 0) {
			// generate a BigInteger
			BigInteger num = new BigInteger(50, random);
			// change the BigInteger into a byte array
			byte[] numInByteArr = num.toByteArray();

			// make sure the BigInteger is with 50 digits
			if (num.toString().length() == 50) {

				// divisible by 2
				if (num.intValue() % 2 == 0) {
					System.out.println(num);
					numOfNum--;
					continue;
				}

				// divisible by 3
				long sumOfByte = 0;
				for (int j = 0; j < numInByteArr.length; j++) {
					sumOfByte += numInByteArr[j];
				}
				if (sumOfByte % 3 == 0) {
					System.out.println(num);
					numOfNum--;
					continue;
				}
			}
		}

	}

}
