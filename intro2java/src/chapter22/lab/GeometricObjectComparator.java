package chapter22.lab;

import java.util.Comparator;

public class GeometricObjectComparator implements Comparator<GeometricObject>, java.io.Serializable {
	
	public int compare(GeometricObject o1, GeometricObject o2) {
		double area1 = o1.getArea();
		double area2 = o2.getArea();

		if (area1 < area2)
			return -1;
		else if (area1 == area2)
			return 0;
		else
			return 1;
	}

	public int comparePerimeter(GeometricObject o1, GeometricObject o2) {
		double perimeter1 = o1.getPerimeter();
		double perimeter2 = o2.getPerimeter();

		if (perimeter1 < perimeter2)
			return -1;
		else if (perimeter1 == perimeter2)
			return 0;
		else
			return 1;

	}
}
