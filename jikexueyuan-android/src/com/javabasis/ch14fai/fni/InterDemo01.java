package com.javabasis.ch14fai.fni;

interface Inter1{
	public static final int AGE = 100;//这就是全局常量
	public abstract void tell();
	//接口不能直接实例化实现，要通过子类来实现
	
	
}

interface Inter2{
	public abstract void say();
}

abstract class Abs1{
	public abstract void print();
}

class A extends Abs1 implements Inter1,Inter2{//接口的多实现.同时继承父类
	//因为接口中的方法都是抽象方法，所以里面的方法都要重写
	public void tell() {
		
	}
	public void say(){
		
	}
	public void print(){
		
	}
}

interface Inter3 extends Inter1,Inter2{//接口的多继承
	
}

public class InterDemo01 {

	public static void main(String[] args) {
//		Inter i = new Inter();
		A a = new A();
		a.tell();
		System.out.println(Inter1.AGE);
		a.say();
	}

}
