package chapter22.lab.wk5_6_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Qiufan(Andy) Xu 
 * @date CreateTime: 2015年10月23日 上午10:28:05 
 * @version 1.0 
 * @param 
 */

public class Sort {

	public static void main(String[] args) {
		Time2 time1 = new Time2(12, 20, 40);
		Time2 time2 = new Time2(13, 20, 40);
		Time2 time3 = new Time2(2, 20, 40);
		
		List<Time2> list = new ArrayList<Time2>();
		list.add(time1);
		list.add(time2);
		list.add(time3);
		
		System.out.println("Before sort: \n" + list);
		
		Collections.sort(list, new TimeComparator());
		
		System.out.println("After sort: \n" + list);
		
	}
	
}
