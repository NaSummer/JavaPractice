package chapter08.lab;

import java.util.Scanner;

public class LineraEquation {
	
	private double a,b,c,d,e,f;
	
	public LineraEquation() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter a: ");
		this.a = sc.nextDouble();
		System.out.print("Please Enter b: ");
		this.b = sc.nextDouble();
		System.out.print("Please Enter c: ");
		this.c = sc.nextDouble();
		System.out.print("Please Enter d: ");
		this.d = sc.nextDouble();
		System.out.print("Please Enter e: ");
		this.e = sc.nextDouble();
		System.out.print("Please Enter f: ");
		this.f = sc.nextDouble();
	}
	
	public LineraEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public boolean isSolvable() {
		if (this.a*this.d-this.b*this.c != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getX() {
		double x = (this.e*this.d-this.b*this.f)/(this.a*this.d-this.b*this.c);
		if (x >= 0) {
			x = Math.abs(x);
			return x;
		} else {
			x = Math.abs(x);
			return -x;
		}
	}
	
	public double getY() {
		double y = (this.a*this.f-this.e*this.c)/(this.a*this.d-this.b*this.c);
		if (y >= 0) {
			y = Math.abs(y);
			return y;
		} else {
			y = Math.abs(y);
			return -y;
		}
		
	}
	
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
	
	
	
}
