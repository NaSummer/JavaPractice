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
		 * == �Ƚϵ��ǵ�ַ
		 * equals() �Ƚϵ�������
		 * ��Ϊstr1��str2�Ĵ���������ͬ���������ǵĵ�ַ��ͬ�������==���Ƚϻ᷵��false
		 * str1��str2��������ͬ��������equals�Ƚ����ݻ᷵��true
		 * 
		 * ���������м���ֻ��equals���Ƚ��ַ���
		 */
	}

}
