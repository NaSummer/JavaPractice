package com.javabasis.ch11;

/**
 * ���췽�� ��ʽ�� �������η� �����ƣ����� ������� �� ע�⣺ 1��û�з���ֵ���� 2���������ƺ������Ʊ�����ͬ 3������Ҫ���ã����Զ�ִ��
 * 4�����췽��Ҳ�������� ���ã���Ҫ��Ϊ���е����Գ�ʼ�� ÿһ������ʵ����֮�󶼻���ù��췽����
 * ���û�й��췽���������ڱ����ʱ��ᴴ��һ���޲ε�ʲô�������Ĺ��췽��
 */

class People {
	// ���췽��
	int age;
	String name;

	public People(int a, String n) { // ���췽�����Դ��ݲ���
		age = a;
		name = n;
		System.out.println("Name:" + name + "\nAge:" + age);
	}

	public People(int a) { // ���췽��������
		age = a;
		System.out.println("Age:" + age);
	}
}

public class ConstructionMethodDemo01 {

	public static void main(String[] args) {
		People per = new People(30, "Ben");// ����Ҫ����ʵ��������
		// ʵ����new�����People���������ٵ��ù��췽�������Դ��ݲ���
		// ���췽������Ҫ���þͻ��Զ�ִ��

		per.age = 0;// ֻ��Ϊ�˲���ʾ�����������һ�Σ�����ǿ��֢�Ѿ���ҩ�ɾ���

		People per2 = new People(20);// ���췽��������
		// ��ʵ����������������Ĳβ�ͬʱ������ò�ͬ�Ĺ��췽��

		per2.age = 0; // ��AGAIN��ֻ��Ϊ�˲���ʾ�����������һ�Σ�����ǿ��֢�Ѿ���ҩ�ɾ���
	}

}
