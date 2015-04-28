package com.javabasis.ch15string;

public class StringDemo04 {

	public static void main(String[] args) {
		String str = "jikexueyuan";
		
		
		
		System.out.println("Test01:length(): ");
		
		System.out.println(str.length());
		System.out.println();
		
		
		
		System.out.println("Test02:toCharArray(): ");
		
		char data[] = str.toCharArray();
		for (int i = 0; i < data.length; i++){
			System.out.print(data[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("Test03:charAt(): ");
		
		//括号中的数字是从0开始计数的，如填7，将会输出字符串的第八个字符
		System.out.println(str.charAt(7));
		System.out.println();
		
		
		
		System.out.println("Test04-1:getBytes(): ");
		
		byte bytes[] = str.getBytes();
		for (int i = 0; i < bytes.length; i++){
			System.out.print(bytes[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("Test04-2:getBytes(): ");
		
		System.out.println(new String(bytes));
		System.out.println();
		
		
		
		System.out.println("Test05:indexOf(): ");
		
		System.out.println(str.indexOf("@"));
	}

}
