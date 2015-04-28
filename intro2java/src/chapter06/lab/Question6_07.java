package chapter06.lab;

public class Question6_07 {

	public static void main(String[] args) {
		int[] counts = new int[10];
		for (int i = 0; i < 100; i++) {
			counts[(int) (Math.random() * 10)]++;
		}
		print(counts);
	}
	
	public static void print(int[] counts) {
		System.out.println("The count fo each number:");
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i+": "+counts[i]+" times");
		}
	}
}
