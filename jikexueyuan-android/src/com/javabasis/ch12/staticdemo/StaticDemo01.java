package com.javabasis.ch12.staticdemo;
/**
 * static
 * 1��������ȫ�����ԡ�
 * 2����������������ֱ��ͨ����������
 * 3��ע�⣺ʹ��static������ʱ��ֻ�ܷ���static���������Ժͷ���������static���������Ժͷ����ǲ��ܷ��ʵ�
 * @author Qiufan
 *
 */
class Person{
	String name;
	private static String country = "����";
	//����static��country���ȫ�־�̬�����ˣ������������иı�һ�Σ�����������ʵ����������Ҳ����ı����ȫ�ֵı���
	
	public Person(String name) {
		this.name = name;
	}
	
	public static void setCountry(String country) {
		Person.country = country;
	}
	public static String getCountry() {
		return country;
	}
	
	public void tell(){
		System.out.println("������"+name+" �����أ�"+country);
	}
	
}

public class StaticDemo01 {
	public static void main(String args[]){
		
		Person.setCountry("�Ϻ�");//��̬�����Ժͷ�����ö�ͨ�����������ã�����������p1���ֶ������ƣ�������ʵ����֮ǰִ��
		Person p1 = new Person("����");
//		Person.country ="�Ϻ�";  //��Ϊ����static����country�������������������ʾ����������������ö�������ʾ
		p1.tell();
		Person p2 = new Person("����");
//		p2.country ="�Ϻ�";
		p2.tell();
		Person p3 = new Person("����");
//		p3.country ="�Ϻ�";
		p3.tell();
	}

}
