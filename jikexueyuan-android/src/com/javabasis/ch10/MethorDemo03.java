package com.javabasis.ch10;

public class MethorDemo03 {

	public static void main(String[] args) {
		System.out.println(addNum(100));
		
	}
	//�ݹ����
	public static int addNum(int num){
		if (num==1){
			return 1;
		}else {
			return num+addNum(num-1);
		}
	}
}
