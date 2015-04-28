package labexam01;

public class LeastRow {

	public static void main(String[] args) {
		int[][] m = new int[6][6];
		int least = Integer.MAX_VALUE;
		int leastRow = -1;
		for (int i = 0; i < m.length; i++) {
			int sum = 0;
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = (int)(Math.random()*10);
				sum += m[i][j];
				System.out.print(m[i][j]);
			}
			if (sum < least) {
				least = sum;
				leastRow = i;
			}
			System.out.println();
		}
		System.out.println("The least row index: " + leastRow);
	}

}
