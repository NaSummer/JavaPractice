/**
 * 概要
 * 	String字符串
 * 	String字符串常用方法
 * 	StringBuffer
 * 	StringBuilder
 * 
 * 一、String字符串
 * 	1、实例化String对象(StringDemo01.java)
 * 		直接赋值
 * 		使用关键字new
 * 			new String的话会在堆内存中创建两个字符串，其中一个没有被指向，所以是无用的，等待被回收
 * 				原因：【new String("hello")】这个整体将占用一个堆内存(2)，
 * 					而其中的“hello”将会先占用一个堆内存(1)储存内容，然后在传递给对内存(2)
 * 			处于对内存考虑，建议直接赋值来实例化String。
 * 	2、String内容的比较(StringDemo02.java)
 * 		开发过程中几乎只用equals来比较字符串
 * 	3、字符串的内容不可更改(StringDemo03.java)
 * 
 * 二、String字符串常用方法
 * 	1、字符串长度：length()方法(StringDemo04.java)
 * 	2、字符串转换成数组：toCharArray()方法(StringDemo04.java)
 * 	3、从字符串中取出指定位置的字符：charAt()方法(StringDemo04.java)
 * 		括号中的数字是从0开始计数的，如填7，将会输出字符串的第八个字符
 * 	4、字符串与byte数组的转换：getBytes()
 * 	5、检测字符串中存在的字符：indexOf()
 * 		返回第一次出现的位置，如果没有返回-1
 * 	6、去掉字符串的前后空格：trim()
 * 	7、从字符串中取出子字符串：subString()
 * 	8、大小写转换：toLowerCase() toUpperCase()
 * 	9、判断字符串的开头结尾字符：endsWith() startWith()
 * 	10、替换String字符串中的一个字符：replace()
 * 
 * 三、StringBuffer
 * 	1、认识StringBuffer(StringBufferDemo01.java)
 * 		缓冲区，本身也是操作字符串，但是与String不同，StringBuffer是可以更改的
 * 		StringBuffer是一个操作类，必须通过实例化进行操作
 * 	2、StringBuffer常用方法
 * 		append()
 * 		insert()
 * 		replace()
 * 		indexOf()
 * 	3、StringBuffer的应用(StringDemo05.java)
 * 	4、StringBuffer与String类型的效率对比(StringDemo05.java)
 * 
 * 四、StringBuilder
 * 	1、StringBuilder定义
 * 		一个可变的字符序列。
 * 		该类被设计用作StringBuffer的一个简易替换，
 * 		用在字符串缓冲区被单个线程使用的时候，建议优先考虑该类，速度比StringBuffer还要快
 * 	2、但是如果涉及到线程安全方面，建议使用StringBuffer
 * 	3、StringBuilder常用方法
 * 		append()
 * 		insert()
 * 
 */
/**
 * @author Qiufan
 *
 */
package com.javabasis.ch15string;