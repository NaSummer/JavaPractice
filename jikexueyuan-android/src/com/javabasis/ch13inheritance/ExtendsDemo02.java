package com.javabasis.ch13inheritance;

/**
 * 继承的限制
 * 1、在java中只允许单继承
 * 		一个Class不能同时继承多个Class，但是可以链状单继承（多层继承）
 * 		一个Class可一被多个Class继承
 * 2、子类不能直接访问父类的私有成员
 * 		解决方法：通过public的getter和setter来访问父类的私有成员
 * @author Qiufan
 *
 */

class People{
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Worker extends People{
	public void tell() {
		System.out.println(getAge());
	}
}

class PetWorker extends Worker{
	//这样继承是可以的
}

//class PetWorker2 extends Worker,Person{
//	//这样继承是不允许的
//}

public class ExtendsDemo02 {

	public static void main(String[] args) {
		Worker w = new Worker();
		w.setAge(50);
		w.tell();
		
	}

}
