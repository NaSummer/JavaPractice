package com.javabasis.ch11;

/**
 * 构造方法 格式： 访问修饰符 类名称（）｛ 程序语句 ｝ 注意： 1、没有返回值类型 2、方法名称和类名称必须相同 3、不需要调用，会自动执行
 * 4、构造方法也可以重载 作用：主要是为类中的属性初始化 每一个类在实例化之后都会调用构造方法，
 * 如果没有构造方法，程序在编译的时候会创建一个无参的什么都不做的构造方法
 */

class People {
	// 构造方法
	int age;
	String name;

	public People(int a, String n) { // 构造方法可以传递参数
		age = a;
		name = n;
		System.out.println("Name:" + name + "\nAge:" + age);
	}

	public People(int a) { // 构造方法的重载
		age = a;
		System.out.println("Age:" + age);
	}
}

public class ConstructionMethodDemo01 {

	public static void main(String[] args) {
		People per = new People(30, "Ben");// 对类要进行实例化操作
		// 实际上new后面的People（）就是再调用构造方法，可以传递参数
		// 构造方法不需要调用就会自动执行

		per.age = 0;// 只是为了不提示警告而随便调用一次，看来强迫症已经无药可救了

		People per2 = new People(20);// 构造方法的重载
		// 当实例化操作中所传入的参不同时，会调用不同的构造方法

		per2.age = 0; // 【AGAIN】只是为了不提示警告而随便调用一次，看来强迫症已经无药可救了
	}

}
