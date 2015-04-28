package chapter06.lab;

public class Question6_29_Game_PickFourCards_2 {

	public static void main(String[] args) {
		int[] pickedCards = new int[4];
		findAll(pickedCards, 1);
	}
	
	public static void print(int[] pickCards) {
		System.out.print("24=");
		for (int i = 0; i < pickCards.length - 1; i++) {
			System.out.print(pickCards[i] + "+");
		}
		System.out.println(pickCards[pickCards.length - 1]);
	}
	
	public static void findAll(int[] pickedCards, int pickingCardNum) {
		//TODO
	}
	
	public static int sum(int[] pickedCards) {
		int sum = 0;
		for (int i = 0; i < pickedCards.length; i++) {
			sum += pickedCards[i];
		}
		return sum;
	}

}
