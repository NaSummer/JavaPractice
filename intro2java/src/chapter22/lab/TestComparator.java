package chapter22.lab;

import java.util.Comparator;

public class TestComparator {
	public static void main(String[] args) {
		GeometricObject g1 = new Rectangle(5, 5);
		GeometricObject g2 = new Circle(5);

		GeometricObject g = max(g1, g2, new GeometricObjectComparator());
		System.out.println("The area of the larger object is " + g.getArea());
		
		g = min(g1, g2, new GeometricObjectComparator());
		System.out.println("The area of the larger object is " + g.getArea());
		
		g = maxPerimeter(g1, g2, new GeometricObjectComparator());
		System.out.println("The perimeter of the larger object is " + g.getPerimeter());
	}

	public static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c) {
		if (c.compare(g1, g2) > 0)
			return g1;
		else
			return g2;
	}
	
	public static GeometricObject min(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c) {
		if (c.compare(g1, g2) < 0)
			return g1;
		else
			return g2;
	}
	
	/**
	 * 
	 * @param 
	 * @return 
	 */
	public static GeometricObject maxPerimeter(GeometricObject g1, GeometricObject g2, GeometricObjectComparator c) {
		if (c.comparePerimeter(g1, g2) > 0)
			return g1;
		else
			return g2;
	}
	
}