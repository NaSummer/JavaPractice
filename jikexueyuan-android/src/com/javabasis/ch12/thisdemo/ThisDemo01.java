package com.javabasis.ch12.thisdemo;
/**
 * this�ؼ���
 * 1����ʾClass�е����Ժ͵��÷���
 * 2�����ñ�Class�еĹ��췽�������ع����еĵ��ù�ϵ��
 * 
 * 3����ʾ��ǰ����
 * @author Qiufan
 *
 */
class People{
	private String name;
	private int age;
	
	public People(String name,int age) {
		this();//this���ñ�Class�еĹ��췽�����������أ�������ڹ��췽�������У����Եݹ飿��
		this.name =name;//�����this��ʾ���Ǳ�Class�е�����name
		this.age = age;//ͬ��
	}
	
	//����һ�����췽��
	public People() {
		System.out.println("�޲������췽��");
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void tell(){
		System.out.println("����:"+this.getName()+"   ���䣺" +this.getAge());
		//������this���ñ�Class�ķ���
	}
}

public class ThisDemo01 {
	public static void main(String args[]){
		People p = new People("����", 30);
		p.tell();
	}

}
