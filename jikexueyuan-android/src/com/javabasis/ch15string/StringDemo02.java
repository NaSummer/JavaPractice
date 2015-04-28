package com.javabasis.ch15string;

public class StringDemo02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println(a==b);
		
		String str1 = "Hello";
		String str2 = new String("Hello");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		/**
		 * == 比较的是地址
		 * equals() 比较的是内容
		 * 因为str1和str2的创建方法不同，所以他们的地址不同，因此用==来比较会返回false
		 * str1和str2的内容相同，所以用equals比较内容会返回true
		 * 
		 * 开发过程中几乎只用equals来比较字符串
		 */
	}

}
