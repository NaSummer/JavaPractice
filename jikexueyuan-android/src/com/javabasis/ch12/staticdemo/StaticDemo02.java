package com.javabasis.ch12.staticdemo;
/**
 * 3、注意：使用static方法的时候，只能访问static声明的属性和方法，而非static声明的属性和方法是不能访问的
 * 如主函数是static的，就不能调用一个不是static的方法
 * @author Qiufan
 *
 */

/*
 * private int i = 10; //这里i没有用static修饰所以不能被用static修饰的主函数使用
	
	public static void main(String args[]){
		System.out.println(i);
		tell();
	}
	public void tell(){ //这个方法没有用static修饰所以不能被用static修饰的主函数调用
		
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
