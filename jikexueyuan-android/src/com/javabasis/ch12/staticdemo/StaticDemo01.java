package com.javabasis.ch12.staticdemo;
/**
 * static
 * 1、声明【全局属性】
 * 2、声明【方法】：直接通过类名调用
 * 3、注意：使用static方法的时候，只能访问static声明的属性和方法，而非static声明的属性和方法是不能访问的
 * @author Qiufan
 *
 */
class Person{
	String name;
	private static String country = "北京";
	//这里static让country变成全局静态属性了，当在主函数中改变一次，就算是重新实例化操作，也不会改变这个全局的变量
	
	public Person(String name) {
		this.name = name;
	}
	
	public static void setCountry(String country) {
		Person.country = country;
	}
	public static String getCountry() {
		return country;
	}
	
	public void tell(){
		System.out.println("姓名："+name+" 出生地："+country);
	}
	
}

public class StaticDemo01 {
	public static void main(String args[]){
		
		Person.setCountry("上海");//静态的属性和方法最好都通过类名来调用，而不是用像p1这种对象名称；可以在实例化之前执行
		Person p1 = new Person("张三");
//		Person.country ="上海";  //因为用了static修饰country，所以最好用类名来表示，而不是像下面的用对象名表示
		p1.tell();
		Person p2 = new Person("李四");
//		p2.country ="上海";
		p2.tell();
		Person p3 = new Person("王五");
//		p3.country ="上海";
		p3.tell();
	}

}
