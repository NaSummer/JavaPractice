package com.javabasis.ch10;

//������Ҫ��д
//��һ���ļ���ֻ�ܴ���һ��public class
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
		 * ��������
		 * Ҫ���ڴ�Ƕ����
		 */
		//��������ջ�ڴ��д���һ��ָ��
//		Person per = null;
		//ʵ�����������ڶ��ڴ��д�������ռ䣬����ջ�ڴ��е�ָ���ַָ���¿��ٵĶ��ڴ�ռ�
//		per = new Person();
		
		//������ʵ������������һ
		Person per = new Person();
		
		//��ֵ
		per.name = "Andy";
		per.age = 19;
		//��������
		per.tell();
		
	}

}