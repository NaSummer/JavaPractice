package chapter22.lab.wk5_6_2;

import java.util.Comparator;

public class BrandComparator implements Comparator<HDTV>, java.io.Serializable {
	public int compare(HDTV o1, HDTV o2) {
		String brand1 = o1.getBrand();
		String brand2 = o2.getBrand();

		return compareString(brand1, brand2);
	}
	
	private <T extends Comparable<T>> int compareString(T x, T y) {
		if (x.compareTo(y) > 0) {
			return 1;
		} else if (x.compareTo(y) == 0) {
			return 0;
		} else {
			return -1;
		}
	}
}
