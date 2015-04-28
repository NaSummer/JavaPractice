package chapter06.lab;

public class Question6_22_EightQueens {
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {

		output(calculate());

	}
	
	/**
	 * Print the result in the console
	 * @param result : map
	 */
	public static void output(int[] result) {
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i]; j++) {
				System.out.print("| ");
			}
			System.out.print("|Q");
			for (int j = result.length - 1; j > result[i]; j--) {
				System.out.print("| ");
			}
			System.out.println("|");
		}
	}

	public static int[] calculate() {
		
		/*
		 * store the position of queen in each row
		 */
		int[] map = new int[8];
		
		/*
		 * use "useAllNum" with "triedNum[]"
		 * when there is no solution in one process
		 * use "useAllNum" to continue the process and avoid keeping random number 
		 * Actually before using it, it will be changed by Method "UseAllNum()", so there is no need to initialize it
		 * but in Java, we have to initialize it.
		 * to avoid error in accident and keep the first time of the loop going, initialize it as false
		 */
		boolean useAllNum = false;
		
		
		do {
			
			/*
			 * store whether the line have been used
			 */
			boolean[] useOfLine = new boolean[8];
			
			/*
			 * 
			 */
			boolean[] triedNum = null; 
			
			
			for (int NumOfRow = 0; NumOfRow < map.length; NumOfRow++) {
				
				int randomNum = 0;
				triedNum = new boolean[8];
				
				do {
					
					useAllNum = UseAllNum(triedNum);
					if (useAllNum) {
						break;
					}
					
					randomNum = (int) (Math.random() * 8);
					triedNum[randomNum] = true;
				} while (probability(map, useOfLine, NumOfRow, randomNum, triedNum));
				
				
				
				if (useAllNum) {
					break;
				}
				
				useOfLine[randomNum] = true;
				map[NumOfRow] = randomNum;
				
				//test
				//output(map);
			}
			
		} while (useAllNum);
		
		return map;
		
	}
	
	public static boolean probability(int[] map, boolean[] useOfLine, int NumOfRow, int randomNumber, boolean[] triedNum) {
		
		if (useOfLine[randomNumber]){
			triedNum[randomNumber] = true;
			return true;
		}
		
		for (int i = 0; i < NumOfRow; i++) {
			if (NumOfRow-i == Math.abs(randomNumber-map[i])) {
				triedNum[randomNumber] = true;
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean UseAllNum(boolean[] triedNum) {
		for (int i = 0; i < triedNum.length; i++) {
			if (!triedNum[i]) {
				return false;
			}
		}
		
		return true;
	}
}