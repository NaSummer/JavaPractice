package assignment4;

public class TestStackOfIntegers {

	public static void main(String[] args) {
		System.out.println("The prime numbers less than 120 are ");
		StackOfIntegers stack = new StackOfIntegers();
		
		// find prime numbers
		for (int i = 2; i <= 120 ; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i%j==0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				stack.push(i);
			}
		}
		
		// print result
		int i = 0;
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
			if (++i==10) {
				i = 0;
				System.out.println();
			}
		}
	}

}
