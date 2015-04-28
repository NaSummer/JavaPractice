package com.javabasis.ch15string;

public class StringDemo05 {

	public static void main(String[] args) {
		
		//��String��ʵ��������ܵĻ����ڶ��ڴ��д���100��String���ݣ��ǳ��˷��ڴ棬���ٶȽ���
		strAccumulation(100);
		
		System.out.println();
		
		//��StringBuffer�ڴ�����ӭ�ж��⣬�ٶȽϿ�
		strBufferAccumulation(100);
		
		System.out.println();
		
		/**
		 * ���ַ���Ч�ʶԱ�===================================================
		 */
		
		//Set the times of the loop
		final int LOOPTIMES = 100000;
		
		strTest(LOOPTIMES);
		strBufferTest(LOOPTIMES*1000);//StringBuffer�ڷ����б�������������
		strBuilderTest(LOOPTIMES*1000);
		
		int loopTimes = 100000000;
		long startTime = 0;
		long endTime = 0;
		System.out.println((loopTimes/10000)+"W��StringBuffer������main����Ӳ�������ʱ�䣺");
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
		 * 10W��String������Ӳ�������ʱ�䣺4209ms
		 * 10000W��StringBuffer������Ӳ�������ʱ�䣺1583ms
		 * 10000W��StringBuilder������Ӳ�������ʱ�䣺1377ms
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
		System.out.print((loopTimes/10000)+"W��String������Ӳ�������ʱ�䣺");
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
		System.out.println((loopTimes/10000)+"W��StringBuffer������Ӳ�������ʱ�䣺");
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
		System.out.println((loopTimes/10000)+"W��StringBuilder������Ӳ�������ʱ�䣺");
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
