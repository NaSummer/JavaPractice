package labexam01;

import java.util.Scanner;

public class LeftmostLowestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] x = new double[6];
		double[] y = new double[6];
		double lowestX = 0;
		double lowestY = 0;
		double b = Double.MAX_VALUE;
		System.out.print("Enter 6 points: ");
		for (int i = 0; i < y.length; i++) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
			if (x[i]+y[i]<b) {
				b = x[i]+y[i];
				lowestX = x[i];
				lowestY = y[i];
			}
		}
		System.out.print("The leftmost lowest point is (" + lowestX + ", " + lowestY + ")");
	}

}
