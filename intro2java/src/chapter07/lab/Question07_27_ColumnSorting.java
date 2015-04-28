package chapter07.lab;

import java.util.Scanner;

/**
 * 
0.15 0.875 0.375
0.55 0.005 0.225
0.30 0.12 0.4
 * @author Qiufan
 *
 */

public class Question07_27_ColumnSorting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[][] m = new double[3][3];
		double[][] result = new double[3][3];
		
		System.out.println("Enter a 3-by-3 matrix row by row:");
		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[0].length; column++) {
				m[row][column] = scanner.nextDouble();
			}
		}
		System.out.println();
		
		result = sortColumn(m);
		print(result);
	}
	
	public static double[][] sortColumn(double[][] m) {
		double[][] result = new double[3][3];
		for (int row = 0; row < result.length; row++) {
			for (int column = 0; column < result[0].length; column++) {
				result[row][column] = m[row][column];
			}
		}
		result = sortMatrix(result);
		return result;
	}
	
	public static double[][] sortMatrix(double[][] m) {
		for (int column = 0; column < m[0].length; column++) {
			double[] tempArray = new double[3];
			for (int row = 0; row < m.length; row++) {
				tempArray[row] = m[row][column];
			}
			tempArray = sortArray(tempArray);
			for (int row = 0; row < tempArray.length; row++) {
				m[row][column] = tempArray[row];
			}
		}
		return m;
	}
	
	public static double[] sortArray(double[] row) {
		for (int index = 0; index < row.length; index++) {
			int minNumIndex = index;
			for (int i = index+1; i < row.length; i++) {
				if (row[i]<row[minNumIndex]) {
					minNumIndex = i;
				}
			}
			double temp = row[minNumIndex];
			row[minNumIndex] = row[index];
			row[index] = temp;
		}
		return row;
	}
	
	public static void print(double[][] m) {
		System.out.println("The row-sorted array is");
		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[0].length; column++) {
				System.out.print(m[row][column]+"\t");
			}
			System.out.println();
		}
	}
}
