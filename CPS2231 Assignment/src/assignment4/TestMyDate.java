package assignment4;

import java.util.Scanner;

class TestMyDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MyDate date1 = new MyDate();
		System.out.println("MyDate(): ");
		System.out.println("\tyear:\t " + date1.getYear());
		System.out.println("\tmonth:\t " + date1.getMonth());
		System.out.println("\tday:\t " + date1.getDay());
		
		MyDate date2 = new MyDate(3128564581335L);
		System.out.println("MyDate(elapsedTime): ");
		System.out.println("\tyear:\t " + date2.getYear());
		System.out.println("\tmonth:\t " + date2.getMonth());
		System.out.println("\tday:\t " + date2.getDay());
		
		date1 = new MyDate(2020, 4, 3);
		System.out.println("MyDate(year, month, day): ");
		System.out.println("\tyear:\t " + date1.getYear());
		System.out.println("\tmonth:\t " + date1.getMonth());
		System.out.println("\tday:\t " + date1.getDay());
		
		date2.setDate(3128564581335L);
		System.out.println("MyDate.setDate(elapsedTime): ");
		System.out.println("\tyear:\t " + date2.getYear());
		System.out.println("\tmonth:\t " + date2.getMonth());
		System.out.println("\tday:\t " + date2.getDay());
		
		
	}

}
