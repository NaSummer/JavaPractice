package com.javabasis.ch12.thisdemo;
/**
 * this
 * 3����ʾ��ǰ����
 * @author Qiufan
 *
 */
class People1{
	public void tell(){
		System.out.println(this);
		//����this��ʾ���ǵ�ǰ���ڵ����Class����
	}
	
}

public class ThisDemo02 {
	public static void main(String args[]){
		People1 p = new People1();
		System.out.println(p);//�����������p���������tell�����this����ͬһ������
		p.tell();
		//���������ַ�ʽ���ȶ����������Ƿ���ͬһ������
	}

}
