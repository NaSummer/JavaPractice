package com.javabasis.ch11;

class Person {
	/*
	 * privateʵ���˷�װ�� ����ĳЩ���Ժͷ��������ⲿ������ ʵ�ָ����Ե�set��get������Ϊ�ⲿ������
	 * set��get�������Լ������ģ�������ϵͳ�ؼ��ֻ����ṩ�ķ���
	 */
	private int age; // ��������б�����ͨ��һ��public�ķ������ı�age��ֵ
	public String name;

	/*
	 * ����Ҽ�source->Generate Getters and Setters���Կ��ٴ���get��set����
	 */
	public int getAge() {
		return age;
	}

	// �����������age�ķ�����������ж�����ǿ��ȫ��
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
