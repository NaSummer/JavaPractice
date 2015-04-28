package com.javabasis.ch11;

/**
 * 匿名对象：没有名字的对象 1、如果程序中只是用一次该对象，就可以使用匿名对象的方式，可以提高内存利用率（涉及到垃圾回收机制）
 */

class Student {
	public void tell() {
		System.out.println("Hello Java");
	}
}

public class AnonymousObjectDemo01 {

	public static void main(String[] args) {
		// 一下为正常的调用方法
		Student stu = new Student();
		stu.tell();

		// 匿名对象的创建
		new Student().tell();

	}

}
