package com.javabasis.ch10;

//类名称要大写
//在一个文件中只能存在一个public class
class Person{
	String name;
	int age;
	
	public void tell() {
		System.out.println("Name: " + name + "\nAge: " + age);
	}
	
}

public class ClassDemo01 {
	
	public static void main(String[] args) {
		/**
		 * 创建对象
		 * 要从内存角度理解
		 */
		//声明：在栈内存中创建一个指针
//		Person per = null;
		//实例化操作：在堆内存中创建储存空间，并让栈内存中的指针地址指向新开辟的堆内存空间
//		per = new Person();
		
		//声明和实例化操作二合一
		Person per = new Person();
		
		//赋值
		per.name = "Andy";
		per.age = 19;
		//方法调用
		per.tell();
		
	}

}