package com.javabasis.ch13inheritance;
/**
 * 方法的重写
 * 	1、在继承中，也存在着重写的概念，其实就是子类定义了和父类同名的方法
 * 	2、定义：方法名称相同，返回值类型相同，参数也相同
 * 	3、重写的限制：被子类重写的方法不能拥有比父类方法更加严格的访问权限
 * 	4、访问权限：private<default<public
 * @author Qiufan
 *
 */
class A {
	public void tell() {
		System.out.println("我是tell方法");
	}
	void say() { //这就是一个default的方法
		
	}
}

class B extends A {
	public void tell() {
		super.tell();
		System.out.println("我重写了tell方法");
	}
//	private void say() { //这是不合法的，say在父类中以default定义，private就比default更加严格，所以不能使用
//		
//	}
}

public class ExtendsDemo04 {

	public static void main(String[] args) {
		B b = new B();
		b.tell();
	}

}
