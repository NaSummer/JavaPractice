package com.javabasis.ch11;

/**
 * ��������û�����ֵĶ��� 1�����������ֻ����һ�θö��󣬾Ϳ���ʹ����������ķ�ʽ����������ڴ������ʣ��漰���������ջ��ƣ�
 */

class Student {
	public void tell() {
		System.out.println("Hello Java");
	}
}

public class AnonymousObjectDemo01 {

	public static void main(String[] args) {
		// һ��Ϊ�����ĵ��÷���
		Student stu = new Student();
		stu.tell();

		// ��������Ĵ���
		new Student().tell();

	}

}
