package com.javabasis.ch13inheritance;

/**
 * 1���̳еĻ�������
 * 		��չ����Ĺ���
 * 2��java��ʹ��extends�ؼ�����ɼ̳�
 * 		class ���� extends ���� {}
 * 
 * @author Qiufan
 *
 */

class Person{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void tell(){
		System.out.println("Name:"+getName()+"\nAge:"+getAge());
	}
	
}

class Student extends Person{
//	private int age;
//	private String name;
	private int score;
	
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public void say(){
		System.out.println("Score:"+getScore());
	}
}

public class ExtendsDemo01 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(20);
		s.setName("Ball");
		s.setScore(100);
		s.tell();
		s.say();
		
	}

}
