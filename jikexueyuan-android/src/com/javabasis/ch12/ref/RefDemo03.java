package com.javabasis.ch12.ref;

/**
 * String���͵����������ô���ʱ���ɸı�
 * ���Ǹð����д��ݵ���һ��Class��������String
 * Class�����������ô���ʱ���Ըı䣬
 * �����Class�а�����һ��String���͵ı�����
 * ��ΪClass���ݿ��Ըı䣬���԰��������е�String���Ըı�
 * @author Qiufan
 *
 */

class Ref2 {
	String temp = "hello";
}

public class RefDemo03 {
	public static void main(String args[]) {
		Ref2 r1 = new Ref2();
		r1.temp = "jike";
		System.out.println(r1.temp);
		tell(r1);
		System.out.println(r1.temp);
	}

	public static void tell(Ref2 r2) {
		r2.temp = "xueyuan";
	}
}
