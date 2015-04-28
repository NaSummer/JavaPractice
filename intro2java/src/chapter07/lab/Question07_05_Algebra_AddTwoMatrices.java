package chapter07.lab;

import java.util.Scanner;

/**
 * Finished
 * 
 * input data
1 2 3 4 5 6 7 8 9
0 2 4 1 4.5 2.2 1.1 4.3 5.2
 * @author Qiufan
 *
 */

public class Question07_05_Algebra_AddTwoMatrices {

	public static void main(String[] args) {
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] resultingMatrix = new double[3][3];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter matrix1: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix1[i][j] = scanner.nextDouble();
			}
		}
		System.out.print("Enter matrix2: ");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				matrix2[i][j] = scanner.nextDouble();
			}
		}

		resultingMatrix = addMatrix(matrix1, matrix2);

		printResult(matrix1, matrix2, resultingMatrix);

	}

	public static void printResult(double[][] matrix1, double[][] matrix2,
			double[][] resultingMatrix) {
		System.out.println("The multiplication of the matrices is");
		for (int i = 0; i < resultingMatrix.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			if (i == 1) {
				System.out.print(" +");
			}
			System.out.print("\t");
			for (int j = 0; j < matrix2.length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			if (i == 1) {
				System.out.print(" =");
			}
			System.out.print("\t");
			for (int j = 0; j < resultingMatrix.length; j++) {
				System.out.print(resultingMatrix[i][j] + " ");
			}
			System.out.println();

		}
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] result = new double[a.length][a[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}

}
