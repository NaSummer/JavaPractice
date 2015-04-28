package proj02.part2;

public class QuadraticEquation {

	private int a;
	private int b;
	private int c;
	private double discriminant;

	public QuadraticEquation() {
		this.a = 1;
		this.b = -2;
		this.c = -3;
		this.discriminant = Math.pow(b, 2) - (4 * a * c);
	}

	public QuadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.discriminant = Math.pow(b, 2) - (4 * a * c);
	}

	public double getDiscriminant() {
		return this.discriminant;
	}

	public double getRoot1() {
		if (this.discriminant>=0) {
			return (-this.b-Math.sqrt(discriminant))/(2*this.a);
		} else {
			System.err.println("The quadratic equation has no root.");
			return Double.MAX_VALUE;
		}
	}
	
	public double getRoot2() {
		if (this.discriminant>=0) {
			return (-this.b+Math.sqrt(discriminant))/(2*this.a);
		} else {
			System.err.println("The quadratic equation has no root.");
			return Double.MAX_VALUE;
		}
	}
	
	public String printEquation() {
		
		String result = null;
		
		if (this.a == 1) {
			result = "x^2";			
		} else {
			result = this.a + "x^2";			
		}

		if (this.b > 1) {
			result = result + "+" + this.b + "x";
		} else if (this.b < 0){
			result = result + this.b + "x";
		} else {
			result = result + "x";
		}
		
		if (this.c > 0) {
			result = result + "+" + this.c;
		} else if (this.c < 0) {
			result = result + this.c;
		}
		
//		result = result + "=0";
		
		return result + "=0";
	}
	
	// ==========accessor==========
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

}
