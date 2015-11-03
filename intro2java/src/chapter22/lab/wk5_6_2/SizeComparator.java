package chapter22.lab.wk5_6_2;

import java.util.Comparator;

public class SizeComparator implements Comparator<HDTV>, java.io.Serializable {
	public int compare(HDTV o1, HDTV o2) {
		double size1 = o1.getSize();
		double size2 = o2.getSize();

		if (size1 < size2)
			return -1;
		else if (size1 == size2)
			return 0;
		else
			return 1;
	}
}
