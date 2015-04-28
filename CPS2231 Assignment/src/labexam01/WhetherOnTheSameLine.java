package labexam01;

import java.util.Scanner;

public class WhetherOnTheSameLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3 points: ");
		double[] points = new double[6];
		for (int i = 0; i < points.length; i++) {
			points[i] = sc.nextDouble();
		}
		if (isSameLine(points)) {
			System.out.println("They are on the same line.");
		}
	}
	
	private static boolean isSameLine(double[] points) {
		if ( (points[0]==points[2]) && (points[0]==points[4]) ) {
			return true;
		} else {
			double k = (points[3]-points[1])/(points[2]-points[0]);
			double b = points[1]-(k*points[0]);
			if (Math.abs(k*points[4]+b-points[5])<=0.00001) {
				return true;
			}
		}
		return false;
	}
	
}
