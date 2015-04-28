package com.javabasis.ch12.ref;

public class RefDemo02 {
	/**
	 * String类型内容不可改变
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "Hello";
		System.out.println(str1);
		tell(str1);
		System.out.println(str1);
	}

	public static void tell(String str2) {
		str2 = "jike";
	}

}
