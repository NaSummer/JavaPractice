package com.javabasis.ch15string;

public class StringBufferDemo01 {

	public static void main(String[] args) {
		
		//StringBuffer�ǿ��Ը��ĵ�
		
		//StringBufferʵ����
		StringBuffer sb = new StringBuffer();
		//ΪStringBuffer������ݵĺ���(��ԭ�����ݺ�������µ�����)
		sb.append("jikexueyuan");
		//��StringBufferת����String����
		System.out.println(sb.toString());
		tell(sb);
		System.out.println(sb.toString());
		
		
		//�Ա�String�ǲ����Ը��ĵ�
		System.out.println();
		String str = "Hello";
		System.out.println(str);
		tryToChange(str);
		System.out.println(str);
		
		/**
		 * ����������д��ݵ��ǵ�ַ
		 * ����method�иı���String������ʱ��ʵ�����Ǹı��s��ָ��ĵ�ַ
		 * �����������в�û�иı�ԭ��str�ĵ�ַ���������ݲ�û�б��ɹ��ĸı�
		 */
	}
	
	public static void tell(StringBuffer s) {
		s.append("@163.com");
	}

	public static void tryToChange(String s) {
		s = "World";
	}
	
}
