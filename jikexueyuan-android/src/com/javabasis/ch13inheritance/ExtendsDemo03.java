package com.javabasis.ch13inheritance;
/**
 * ��������ʵ��������
 *	1�����������ʵ����֮ǰ�������ȵ��ø����еĹ��췽����֮��������๹�췽��
 */

class Father {
//	private int age;
//	private String Name;
	
	public Father() {
		System.out.println("Father");
	}
}

class Son extends Father {
	public Son() {
		System.out.println("Son");
	}
}

public class ExtendsDemo03 {

	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s);
	}

}
