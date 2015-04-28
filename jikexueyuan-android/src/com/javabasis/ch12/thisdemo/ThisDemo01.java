package com.javabasis.ch12.thisdemo;
/**
 * this关键字
 * 1、表示Class中的属性和调用方法
 * 2、调用本Class中的构造方法（重载过程中的调用关系）
 * 
 * 3、表示当前对象
 * @author Qiufan
 *
 */
class People{
	private String name;
	private int age;
	
	public People(String name,int age) {
		this();//this调用本Class中的构造方法，可以重载，必须放在构造方法的首行（可以递归？）
		this.name =name;//这里的this表示的是本Class中的属性name
		this.age = age;//同上
	}
	
	//重载一个构造方法
	public People() {
		System.out.println("无参数构造方法");
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
		System.out.println("姓名:"+this.getName()+"   年龄：" +this.getAge());
		//这里用this调用本Class的方法
	}
}

public class ThisDemo01 {
	public static void main(String args[]){
		People p = new People("张三", 30);
		p.tell();
	}

}
