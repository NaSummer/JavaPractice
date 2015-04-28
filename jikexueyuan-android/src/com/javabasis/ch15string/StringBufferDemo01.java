package com.javabasis.ch15string;

public class StringBufferDemo01 {

	public static void main(String[] args) {
		
		//StringBuffer是可以更改的
		
		//StringBuffer实例化
		StringBuffer sb = new StringBuffer();
		//为StringBuffer添加内容的函数(在原有内容后面添加新的内容)
		sb.append("jikexueyuan");
		//将StringBuffer转换成String类型
		System.out.println(sb.toString());
		tell(sb);
		System.out.println(sb.toString());
		
		
		//对比String是不可以更改的
		System.out.println();
		String str = "Hello";
		System.out.println(str);
		tryToChange(str);
		System.out.println(str);
		
		/**
		 * 在这个过程中传递的是地址
		 * 当在method中改变了String的内容时，实际上是改变的s所指向的地址
		 * 而在主方法中并没有改变原本str的地址，所以内容并没有被成功的改变
		 */
	}
	
	public static void tell(StringBuffer s) {
		s.append("@163.com");
	}

	public static void tryToChange(String s) {
		s = "World";
	}
	
}
