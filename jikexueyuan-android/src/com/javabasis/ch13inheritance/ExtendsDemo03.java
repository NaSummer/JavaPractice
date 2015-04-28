package com.javabasis.ch13inheritance;
/**
 * 子类对象的实例化过程
 *	1、在子类对象实例化之前，必须先调用父类中的构造方法，之后调用子类构造方法
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
