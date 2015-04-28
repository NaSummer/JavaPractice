package com.javabasis.ch15string;

public class StringDemo05 {

	public static void main(String[] args) {
		
		//用String来实现这个功能的话会在堆内存中创建100个String数据，非常浪费内存，且速度较慢
		strAccumulation(100);
		
		System.out.println();
		
		//用StringBuffer内存问题迎刃而解，速度较快
		strBufferAccumulation(100);
		
		System.out.println();
		
		/**
		 * 三种方法效率对比===================================================
		 */
		
		//Set the times of the loop
		final int LOOPTIMES = 100000;
		
		strTest(LOOPTIMES);
		strBufferTest(LOOPTIMES*1000);//StringBuffer在方法中比在主方法中慢
		strBuilderTest(LOOPTIMES*1000);
		
		int loopTimes = 100000000;
		long startTime = 0;
		long endTime = 0;
		System.out.println((loopTimes/10000)+"W次StringBuffer类型在main中相加操作所用时间：");
		StringBuffer sbfTest = new StringBuffer();
		sbfTest.append("0");
		startTime = System.currentTimeMillis();
		for (int i = 0; i<loopTimes; i++){
			sbfTest.append("0");
		}
		endTime = System.currentTimeMillis();
		System.err.println((endTime-startTime)+"ms");
		
		/**
		 * RESULTS
		 * 10W次String类型相加操作所用时间：4209ms
		 * 10000W次StringBuffer类型相加操作所用时间：1583ms
		 * 10000W次StringBuilder类型相加操作所用时间：1377ms
		 */
		
	}
	
	public static void strAccumulation(int stopNum) {
		String str = "1";
		int sum = 1;
		for (int i = 2; i <= stopNum; i++){
			sum += i;
			str = str + "+" + i;
		}
		System.out.println(str+"="+sum);
	}
	
	public static void strBufferAccumulation(int stopNum) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("1");
		int sum = 1;
		for (int i = 2; i<=stopNum; i++){
			sum += i;
			sbf.append("+"+i);
		}
		System.out.println(sbf.toString()+"="+sum);
	}
	
	public static void strTest(int loopTimes){
		long startTime = 0;
		long endTime = 0;
		System.out.print((loopTimes/10000)+"W次String类型相加操作所用时间：");
		String strTest = "0";
		startTime = System.currentTimeMillis();
		for (int i = 0; i<loopTimes; i++){
			strTest = strTest+"0";
		}
		endTime = System.currentTimeMillis();
		System.err.println((endTime-startTime)+"ms");
		System.out.println();
	}
	
	public static void strBufferTest(int loopTimes) {
		long startTime = 0;
		long endTime = 0;
		System.out.println((loopTimes/10000)+"W次StringBuffer类型相加操作所用时间：");
		StringBuffer sbfTest = new StringBuffer();
		sbfTest.append("0");
		startTime = System.currentTimeMillis();
		for (int i = 0; i<loopTimes; i++){
			sbfTest.append("0");
		}
		endTime = System.currentTimeMillis();
		System.err.println((endTime-startTime)+"ms");
	}
	
	public static void strBuilderTest(int loopTimes) {
		long startTime = 0;
		long endTime = 0;
		System.out.println((loopTimes/10000)+"W次StringBuilder类型相加操作所用时间：");
		StringBuilder sbdTest = new StringBuilder();
		sbdTest.append("0");
		startTime = System.currentTimeMillis();
		for (int i = 0; i<loopTimes; i++){
			sbdTest.append("0");
		}
		endTime = System.currentTimeMillis();
		System.err.println((endTime-startTime)+"ms");
	}

}
