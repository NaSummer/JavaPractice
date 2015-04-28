package chapter08.lab;

import java.util.Scanner;

public class TestLocation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and columns in the array: ");
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		double[][] arr = new double[row][column];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextDouble();
			}
		}
		
		Location maxLocation = locateLargest(arr);
		
		System.out.println("The location of the largest element is " + maxLocation.maxValue + " at (" + maxLocation.row + ", " + maxLocation.column + ")");
		
	}

	public static Location locateLargest(double[][] a) {
		Location location = new Location(0, 0, Double.MIN_VALUE);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > location.maxValue) {
					location.row = i;
					location.column = j;
					location.maxValue = a[i][j];
				}
			}
		}
		return location;
	}
	
}
