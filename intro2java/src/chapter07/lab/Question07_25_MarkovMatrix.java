package chapter07.lab;

import java.util.Scanner;

/**
 * finished
 * 
 * input data 0.15 0.875 0.375 0.55 0.005 0.225 0.30 0.12 0.4
 * 
 * 0.15 -0.875 0.375 0.55 0.005 0.225 0.30 0.12 -0.4
 * 
 * @author Qiufan
 *
 */

public class Question07_25_MarkovMatrix {

	public static void main(String[] args) {
		double[][] matrix = new double[3][3];
		matrix = inputData();
		if (isMarkovMatrix(matrix)) {
			System.out.println("It is a Markov matrix");
		} else {
			System.out.println("It is not a Markov matrix");
		}
	}

	public static double[][] inputData() {
		double[][] tempMatrix = new double[3][3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row:");
		for (int i = 0; i < tempMatrix.length; i++) {
			for (int j = 0; j < tempMatrix[0].length; j++) {
				tempMatrix[i][j] = scanner.nextDouble();
			}
		}
		return tempMatrix;
	}

	public static boolean isMarkovMatrix(double[][] m) {
		for (int j = 0; j < m[0].length; j++) {
			double sum = 0;
			for (int i = 0; i < m.length; i++) {
				if (m[i][j] <= 0) {
					return false;
				}
				sum += (double) (Math.round(m[i][j] * 10)) / 10;
			}
			if (sum != 1) {
				return false;
			}
		}
		return true;
	}
}
