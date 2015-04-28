package chapter06.lab;

public class Question6_29_wrong {

	public static void main(String[] args) {
		int[] usageOfCard = new int[13];
		int count = tryToFindResult(1, usageOfCard, 0);
		System.out.println(count);
	}
	
	public static int tryToFindResult(int numOfCard, int[] usageOfCard, int count) {
		if (numOfCard < 4) {
			for (int i = 0; i < usageOfCard.length; i++) {
				usageOfCard[i]++;
				count = tryToFindResult(numOfCard+1, usageOfCard, count);
				usageOfCard[i] = usageOfCard[i]-1;
			}
			return count;
		}else if (numOfCard == 4) {
			if (sumNow(usageOfCard) < 24-13) {
				return count;
			} else {
				return count+1;
			}
		}
		return count;
	}
	
	public static int sumNow(int[] useOfCard) {
		int sum = 0;
		for (int i = 0; i < useOfCard.length; i++) {
			sum = sum + useOfCard[i] * (i+1);
		}
		return sum;
	}

}
