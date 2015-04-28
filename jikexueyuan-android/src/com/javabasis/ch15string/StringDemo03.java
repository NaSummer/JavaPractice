package com.javabasis.ch15string;

public class StringDemo03 {

	public static void main(String[] args) {
		String str = "Hello";
		str = str + "World";
		System.out.println(str);
		/**
		 * 从输出结果来看，好像是可以更改的，实际上要从内存分析
		 * str在栈内存(Z1)中本来是指向储存了“Hello”的堆内存(D1)
		 * 在执行相加操作时又在堆内存中开辟了一个空间(D2)储存"World"
		 * 然后再在堆内存中开辟空间(D3)储存相加后的结果“HelloWorld”
		 * 最后将str栈内存(Z1)中的地址指向堆内存(D3)
		 * 在这个过程中始终没有改变过堆内存中储存的内容，只是不断地开辟新的堆内存，然后改变栈内存中的地址
		 * 所以说String字符串是不可以更改的
		 */
	}

}
