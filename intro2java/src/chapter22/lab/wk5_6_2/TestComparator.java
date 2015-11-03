package chapter22.lab.wk5_6_2;

import java.util.Collections;
import java.util.LinkedList;

public class TestComparator {
	public static void main(String[] args) {
		// Samsung (20); Samsung (24); Sony (28); Sony (55); TCL(42); TCL (60);

		LinkedList<HDTV> tvList = new LinkedList<HDTV>();
		tvList.add(new HDTV(20, "Samsung"));
		tvList.add(new HDTV(24, "Samsung"));
		tvList.add(new HDTV(28, "Sony"));
		tvList.add(new HDTV(55, "Sony"));
		tvList.add(new HDTV(42, "TCL"));
		tvList.add(new HDTV(60, "TCL"));

//		LinkedList<HDTV> tvList_size = sort_size(tvList, 0, tvList.size() - 1);
//		LinkedList<HDTV> tvList_brand = sort_brand(tvList, 0, tvList.size() - 1);

		LinkedList<HDTV> tvList_size = new LinkedList<HDTV>(tvList);
		LinkedList<HDTV> tvList_brand = new LinkedList<HDTV>(tvList);
		
		Collections.sort(tvList_size, new SizeComparator());
		Collections.sort(tvList_brand, new BrandComparator());
		
		System.out.println("The order based on the TV size is ");
		for (int i = 0; i < tvList_size.size(); i++) {
			System.out.print(tvList_size.get(i).getBrand() + "(" + tvList_size.get(i).getSize() + ") ");
		}
		System.out.println();
		
		System.out.println("The order based on the brand is ");
		for (int i = 0; i < tvList_brand.size(); i++) {
			System.out.print(tvList_brand.get(i).getBrand() + "(" + tvList_brand.get(i).getSize() + ") ");
		}

	}

	// void QuickSort(int e[], int first, int end)
	// if(left < right){
	// int key = v[left];
	// int low = left;
	// int high = right;
	// while(low < high){
	// while(low < high && v[high] > key){
	// high--;
	// }
	// v[low] = v[high];
	// while(low < high && v[low] < key){
	// low++;
	// }
	// v[high] = v[low];
	// }
	// v[low] = key;
	// quicksort(v,left,low-1);
	// quicksort(v,low+1,right);
	// }

	/**
	 * 
	 * @param
	 * @return
	 */
//	private static <T extends Comparable<T>> LinkedList<HDTV> sort_size(LinkedList<HDTV> list, int left, int right) {
//		if (left < right) {
//			int low = left;
//			int high = right;
//			int temp = list.get(left).getSize();
//			while (low < high) {
//				while (low < high && list.get(high).getSize() >= temp) {
//					high--;
//				}
//				list
//				while (i < j && list.get(j).getSize() >= temp) {
//					j--;
//				}
//			}
//		}
//	}
//
//	/**
//	 * 
//	 * @param
//	 * @return
//	 */
//	private static <T extends Comparable<T>> LinkedList<HDTV> sort_brand(LinkedList<HDTV> list, int first, int end) {
//
//		// TODO Auto-generated method stub
//	}

}