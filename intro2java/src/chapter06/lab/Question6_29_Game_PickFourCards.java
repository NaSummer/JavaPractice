package chapter06.lab;

/**
 * Solution: sort 1 1 1 1 1 1 2 1 3 2 2 4
 * 
 * @author Qiufan
 *
 */

public class Question6_29_Game_PickFourCards {

	public static void main(String[] args) {
		for (int numOfCards = 2; numOfCards <= 4; numOfCards++) {
			int[] pickedCards = new int[4];
			findAll(numOfCards, pickedCards, 1);
		}
		printFourSameCards();
	}

	public static void print(int[] chosenNum) {
		System.out.print("24=");
		for (int i = 0; i < chosenNum.length - 1; i++) {
			System.out.print(chosenNum[i] + "+");
		}
		System.out.println(chosenNum[chosenNum.length - 1]);
	}

	public static void printFourSameCards() {
		System.out.println("24=6+6+6+6");
	}

	public static boolean notSame(int[] pickedCards) {
		for (int i = 0; i < pickedCards.length; i++) {
			//TODO
		}
		return true;
	}
	
	public static void findAll(int numOfCards, int[] pickedCards, int pickingCardNum) {
		if (pickingCardNum <= numOfCards) {
			
			if (numOfCards == 2) {
				for (int i = 1; i <= 13; i++) {
					if (notSame(pickedCards)) {
						
					}
					pickedCards[pickingCardNum-1] = i;
					findAll(numOfCards, pickedCards, pickingCardNum+1);
					if (pickingCardNum == numOfCards) {
						if (((pickedCards[0]+pickedCards[1])*2)==24) {
							print(new int[] {pickedCards[0],pickedCards[0],pickedCards[1],pickedCards[1]});
						}else if (pickedCards[0]*3+pickedCards[1]==24) {
							print(new int[] {pickedCards[0],pickedCards[0],pickedCards[0],pickedCards[1]});
						}else if (pickedCards[0]+pickedCards[1]*3==24) {
							print(new int[] {pickedCards[0],pickedCards[1],pickedCards[1],pickedCards[1]});
						}
					}
					pickedCards[pickingCardNum-1] = 0;
				}
				
			} else if (numOfCards == 3) {
				for (int i = 1; i <= 13; i++) {
					pickedCards[pickingCardNum-1] = i;
					findAll(numOfCards, pickedCards, pickingCardNum+1);
					if (pickingCardNum == numOfCards) {
						//TODO
					}
					pickedCards[pickingCardNum-1] = 0;
				}
				
			} else {
				for (int i = 1; i <= 13; i++) {
					pickedCards[pickingCardNum-1] = i;
					findAll(numOfCards, pickedCards, pickingCardNum+1);
					if (pickingCardNum == numOfCards) {
						//TODO
					}
					pickedCards[pickingCardNum-1] = 0;
				}
			}
			
		}
	}
}
