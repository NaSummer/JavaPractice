package proj02.part3;

import java.util.Scanner;

public class TestFindSam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfRows = 0;
		int numOfColumn = 0;
		
		System.out.println("Enter the munber of rows and columns:");
		numOfRows = scanner.nextInt();
		numOfColumn = scanner.nextInt();
		FindSam findSam = new FindSam(numOfRows, numOfColumn);
		System.out.println("Enter everything's IQ in the forest:");
		for (int row = 0; row < numOfRows; row++) {
			for (int column = 0; column < numOfColumn; column++) {
				findSam.setCoordinateData(row, column, scanner.nextInt());
			}
		}
		
		System.out.println("The Sam SAMA's IQ is " + findSam.getMaxValue() + ". He is at (" + findSam.getSamsRow() + "," + findSam.getSamsColumn() + ").");
		
	}

}
