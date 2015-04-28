package com.javabasis.ch12.ref;

/**
 * String类型的内容在引用传递时不可改变
 * 但是该案例中传递的是一个Class，而不是String
 * Class的内容在引用传递时可以改变，
 * 而这个Class中包含了一个String类型的变量，
 * 因为Class内容可以改变，所以包含于其中的String可以改变
 * @author Qiufan
 *
 */

class Ref2 {
	String temp = "hello";
}

public class RefDemo03 {
	public static void main(String args[]) {
		Ref2 r1 = new Ref2();
		r1.temp = "jike";
		System.out.println(r1.temp);
		tell(r1);
		System.out.println(r1.temp);
	}

	public static void tell(Ref2 r2) {
		r2.temp = "xueyuan";
	}
}
