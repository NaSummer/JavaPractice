package chapter08.listing08_01;

public class TestSimpleCircle {

	public static void main(String[] args) {

		SimpleCircle circle1 = new SimpleCircle(4.5);

		System.out.printf("The area is %.2f.\nThe circumference is %.2f", circle1.getArea(), circle1.getPerimeter());

		if (circle1.testAnP()) {
			System.out.println("The area is lager.");
		} else {
			System.out.println("The perimeter is lager.");
		}

	}

}

class SimpleCircle {
	double radius;

	SimpleCircle() {
		radius = 1;
	}

	SimpleCircle(double newRadius) {
		radius = newRadius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

	double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	void setRadius(double NewRadius) {
		radius = NewRadius;
	}

	boolean testAnP() {
		if (getArea() > getPerimeter()) {
			return true;
		} else {
			return false;
		}
	}

}
