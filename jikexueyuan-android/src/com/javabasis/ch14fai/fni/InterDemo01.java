package com.javabasis.ch14fai.fni;

interface Inter1{
	public static final int AGE = 100;//�����ȫ�ֳ���
	public abstract void tell();
	//�ӿڲ���ֱ��ʵ����ʵ�֣�Ҫͨ��������ʵ��
	
	
}

interface Inter2{
	public abstract void say();
}

abstract class Abs1{
	public abstract void print();
}

class A extends Abs1 implements Inter1,Inter2{//�ӿڵĶ�ʵ��.ͬʱ�̳и���
	//��Ϊ�ӿ��еķ������ǳ��󷽷�����������ķ�����Ҫ��д
	public void tell() {
		
	}
	public void say(){
		
	}
	public void print(){
		
	}
}

interface Inter3 extends Inter1,Inter2{//�ӿڵĶ�̳�
	
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
