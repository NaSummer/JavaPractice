package com.javabasis.ch11;

class Person {
	/*
	 * private实现了封装性 保护某些属性和方法不被外部所看见 实现该属性的set和get方法，为外部所访问
	 * set和get方法是自己创建的，而不是系统关键字或者提供的方法
	 */
	private int age; // 对年龄进行保护，通过一个public的方法来改变age的值
	public String name;

	/*
	 * 鼠标右键source->Generate Getters and Setters可以快速创建get和set方法
	 */
	public int getAge() {
		return age;
	}

	// 这个用来传入age的方法可以添加判断来加强安全性
	public void setAge(int age) {
		if (age >= 0 && age < 150) {
			this.age = age;
		}
	}

	public void tell() {
		System.out.println("Age:" + getAge() + "\nName:" + name);
	}

}

public class EncapsulationDemo01 {

	public static void main(String[] args) {
		Person per = new Person();
		per.setAge(30);
		per.name = "Ben";
		per.tell();

	}

}
