package com.javabasis.ch14fai.fni;

abstract class Abs{
	private int age;
	public void tell(){
		
	}
	//���󷽷�
	public abstract void say();
	public abstract void print();
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class AbsDemo extends Abs{
	public void say(){//����Ҫ��д�������е�ȫ�����󷽷�
		System.out.println(getAge());
	}
	public void print(){
		
	}
}

public class AbsDemo01 {

	public static void main(String[] args) {
//		Abs a = new Abs();
		AbsDemo a = new AbsDemo();
		a.setAge(20);
		a.say();
		a.print();
		
	}

}
