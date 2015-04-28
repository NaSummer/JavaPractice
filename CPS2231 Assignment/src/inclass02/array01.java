package inclass02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array01 {

	public static void main(String[] args) {
		int length = 10;
		int[] friends = new int[length];
		for (int i = 0; i < friends.length; i++) {
			friends[i] = i;
		}
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
		
	}

}
