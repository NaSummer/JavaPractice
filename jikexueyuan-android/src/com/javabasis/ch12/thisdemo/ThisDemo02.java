package com.javabasis.ch12.thisdemo;
/**
 * this
 * 3、表示当前对象
 * @author Qiufan
 *
 */
class People1{
	public void tell(){
		System.out.println(this);
		//这里this表示的是当前所在的这个Class对象
	}
	
}

public class ThisDemo02 {
	public static void main(String args[]){
		People1 p = new People1();
		System.out.println(p);//本处输出对象p和下面调用tell输出（this）是同一个对象
		p.tell();
		//可以用这种方式来比对两个对象是否是同一个对象
	}

}
