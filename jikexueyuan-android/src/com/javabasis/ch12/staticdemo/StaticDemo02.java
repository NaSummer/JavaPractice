package com.javabasis.ch12.staticdemo;
/**
 * 3��ע�⣺ʹ��static������ʱ��ֻ�ܷ���static���������Ժͷ���������static���������Ժͷ����ǲ��ܷ��ʵ�
 * ����������static�ģ��Ͳ��ܵ���һ������static�ķ���
 * @author Qiufan
 *
 */

/*
 * private int i = 10; //����iû����static�������Բ��ܱ���static���ε�������ʹ��
	
	public static void main(String args[]){
		System.out.println(i);
		tell();
	}
	public void tell(){ //�������û����static�������Բ��ܱ���static���ε�����������
		
	}
 */

public class StaticDemo02 {
	private static int i = 10;
	
	public static void main(String args[]){
		System.out.println(i);
		tell();
	}
	public static void tell(){
		
	}

}
