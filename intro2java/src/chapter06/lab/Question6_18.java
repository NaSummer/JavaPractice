package chapter06.lab;

import java.util.Scanner;

public class Question6_18 {

	public static void main(String[] args) {
		double[] list = readNum();
		bubbleSort(list);
		print(list);
	}
	
	public static double[] readNum() {
		Scanner sc = new Scanner(System.in);
		double[] list = new double[10];
		System.out.println("Please input ten numbers:");
		for (int i = 0; i < list.length; i++) {
			try {
				list[i] = sc.nextDouble();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return list;
	}

	public static void bubbleSort(double[] list) {
		for (int i = 0; i < list.length-1; i++) {
			for (int j = 0; j < list.length-1; j++) {
				if (list[j] > list[j+1]){
					double temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}
	
	public static void print (double[] list) {
		System.out.println("The sorted number:");
		for (int i = 0; i < list.length-1; i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println(list[list.length-1]);
	}
}
