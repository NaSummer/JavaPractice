package com.javabasis.ch03switch;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������ȼ���");
		char grade = scanner.next().charAt(0);
		switch (grade) {
		case '1':
			System.out.println(5);
			break;
		case '2':
			System.out.println(4);
			break;
		case '3':
			System.out.println(3);
			break;
		case '4':
			System.out.println(2);
			break;
		default:
			System.out.println("����ĵȼ�����");
			break;
		}

		scanner.close();

	}

}
