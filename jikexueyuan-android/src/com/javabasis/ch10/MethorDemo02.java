package com.javabasis.ch10;

public class MethorDemo02 {
	/**
	 * 方法的重载
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		tell(10, 20);
		tell(10, 20, 30);
	}

	public static void tell(int i, int j) {
		System.out.println(i+j);
	}

	public static void tell(int i, int j, int n) {
		System.out.println(i+j+n);
	}
	
	/**
	 * 方法重载的时候，
	 * 如果只是方法的类型不同，而只是参数是相同的，
	 * 这不是方法的重载，是错误的
	 */
	
//	public int tell(){
//		
//	}
//	
//	public String tell(){
//		
//	}
	
	
}
