package chapter21.lab;

/**
 * @author Qiufan(Andy) Xu
 * @date CreateTime: 2015年10月9日 上午9:20:57
 * @version 1.0
 * @param
 */

public class TestComparable {

	public static void main(String[] args) {
		String myCurrentCourse = new String("CPS2232");

		String myOldCourseOne = "CPS 2232";
		String myOldCourseTwo = "CPS2232";

		System.out.println(myCurrentCourse + ".compareTo(" + myOldCourseOne + ") returns "
				+ compare(myCurrentCourse, myOldCourseOne));

		System.out.println();

		System.out.println(
				myCurrentCourse + ".equals(" + myOldCourseTwo + ") returns " + myCurrentCourse.equals(myOldCourseTwo));
		System.out.println(
				myCurrentCourse + ".equals(" + myOldCourseOne + ") returns " + myCurrentCourse.equals(myOldCourseOne));

		System.out.println();

		System.out.println("Andy" + ".compareTo(" + "Alex" + ") returns " + compare("Andy", "Alex"));
		
		System.out.println();
		
		System.out.println(testLabelCompareTo(5.6, 7.7));
		System.out.println(testLabelCompareTo("Tina", "Tiffany"));
		System.out.println(testLabelCompareTo("pear", "apple"));
		System.out.println(testLabelCompareTo("apple", "pear"));
		System.out.println(testLabelCompareTo("John", "Abel"));
		System.out.println(testLabelCompareTo("Abel", "John"));
	}

	public static <T extends Comparable<T>> String compare(String x, String y) {
		if (x.compareTo(y) > 0) {
			return "Positive";
		} else if (x.compareTo(y) == 0) {
			return "Equal";
		} else {
			return "Negative";
		}
	}

	public static <T extends Comparable<T>> int testLabelCompareTo(T x, T y) {
		return x.compareTo(y);
	}

}
