package com.javabasis.ch13inheritance;
/**
 * ��������д
 * 	1���ڼ̳��У�Ҳ��������д�ĸ����ʵ�������ඨ���˺͸���ͬ���ķ���
 * 	2�����壺����������ͬ������ֵ������ͬ������Ҳ��ͬ
 * 	3����д�����ƣ���������д�ķ�������ӵ�бȸ��෽�������ϸ�ķ���Ȩ��
 * 	4������Ȩ�ޣ�private<default<public
 * @author Qiufan
 *
 */
class A {
	public void tell() {
		System.out.println("����tell����");
	}
	void say() { //�����һ��default�ķ���
		
	}
}

class B extends A {
	public void tell() {
		super.tell();
		System.out.println("����д��tell����");
	}
//	private void say() { //���ǲ��Ϸ��ģ�say�ڸ�������default���壬private�ͱ�default�����ϸ����Բ���ʹ��
//		
//	}
}

public class ExtendsDemo04 {

	public static void main(String[] args) {
		B b = new B();
		b.tell();
	}

}
