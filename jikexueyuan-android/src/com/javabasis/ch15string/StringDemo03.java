package com.javabasis.ch15string;

public class StringDemo03 {

	public static void main(String[] args) {
		String str = "Hello";
		str = str + "World";
		System.out.println(str);
		/**
		 * �������������������ǿ��Ը��ĵģ�ʵ����Ҫ���ڴ����
		 * str��ջ�ڴ�(Z1)�б�����ָ�򴢴��ˡ�Hello���Ķ��ڴ�(D1)
		 * ��ִ����Ӳ���ʱ���ڶ��ڴ��п�����һ���ռ�(D2)����"World"
		 * Ȼ�����ڶ��ڴ��п��ٿռ�(D3)������Ӻ�Ľ����HelloWorld��
		 * ���strջ�ڴ�(Z1)�еĵ�ַָ����ڴ�(D3)
		 * �����������ʼ��û�иı�����ڴ��д�������ݣ�ֻ�ǲ��ϵؿ����µĶ��ڴ棬Ȼ��ı�ջ�ڴ��еĵ�ַ
		 * ����˵String�ַ����ǲ����Ը��ĵ�
		 */
	}

}
