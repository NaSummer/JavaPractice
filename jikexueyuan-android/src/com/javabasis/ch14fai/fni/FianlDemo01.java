package com.javabasis.ch14fai.fni;

class People{
	public void tell(){
		
	}
}

class Student extends People{
	@Override
	public void tell() {
		
	}
}

public class FianlDemo01 {

	public static void main(String[] args) {
		String name = "jikexueyuan";
		name = "www.jikexueyuan.com";
		final String OLD_NAME = "JIKEXUEYUAN";
		System.out.println(name+" "+OLD_NAME);
		
	}

}
