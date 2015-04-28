import java.util.Scanner;

/**
 *
 * @author zhwen3235
 * 
 *         modified by @author Qiufan
 */
public class Unit1challenge {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		int sum = 21, n = 0;

		System.out
				.println("The game of Nim starts with 21 of stones. \n"
						+ "Two players alternate turns and on each turn may take either 1, 2, or 3 stones from the pile. \n"
						+ "The player forced to take the last stone loses.");

		while (sum > 0 && sum <= 21) {
			System.out.print("There are " + sum + " stones. ");

			sum = sum - userTakesOut(sum);
			n++;

			if (sum > 0) {
				sum = sum - computerTakesOut(sum);
				n--;
			}
		}

		if (n == 1) {
			System.out.println("Computer wins.");
		} else {
			System.out.println("YOU WIN!");
		}

	}

	public static int userTakesOut(int rest) {
		System.out.print("How many would you like? :");
		return checkInput(rest);
	}

	public static int checkInput(int rest) {
		int tmp = 0;
		Scanner input = new Scanner(System.in);
		tmp = input.nextInt();
		input.nextLine();
		while (tmp < 0 || tmp > 3 || tmp > rest) {
			if (tmp < 0 || tmp > 3) {
				System.err.print("Please choose a number among 1, 2 and 3: ");
			} else {
				System.err.println("The rest of stone is not enough.");
				System.err
						.println("Please input the number less than or equal to"
								+ rest + " and greater than or equal to 1:");
			}
			tmp = input.nextInt();
			input.nextLine();
		}
		return tmp;
	}

	public static int computerTakesOut(int rest) {
		int tmp = 0;
		final int LOW = 1, HIGH = 3;

		if (rest >= 3) {
			tmp = (int) (LOW + Math.random() * (HIGH - LOW + 1));
		}

		else {
			tmp = (int) (LOW + Math.random() * (rest - LOW + 1));
		}

		System.out.println("There are " + rest + " stones. The computer takes "
				+ tmp + " stones.");

		return tmp;
	}
}
