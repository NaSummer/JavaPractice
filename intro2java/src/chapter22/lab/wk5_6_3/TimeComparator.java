package chapter22.lab.wk5_6_3;

import java.util.Comparator;

/**
 * @author Qiufan(Andy) Xu
 * @date CreateTime: 2015年10月23日 上午10:18:08
 * @version 1.2
 * @param
 */

public class TimeComparator implements Comparator<Time2> {

	@Override
	public int compare(Time2 time1, Time2 time2) {
		/**
		 * 
		 * @param
		 * @return
		 */
		
		/*
		 * Version 1.0 
		 */
//		if (time1.getHour() < time2.getHour()) {
//			return -1;
//		} else if (time1.getHour() > time2.getHour()) {
//			return 1;
//		} else {
//			if (time1.getMinute() < time2.getMinute()) {
//				return -1;
//			} else if (time1.getMinute() > time2.getMinute()) {
//				return 1;
//			} else {
//				if (time1.getSecond() < time2.getSecond()) {
//					return -1;
//				} else if (time1.getSecond() > time2.getSecond()) {
//					return 1;
//				} else {
//					return 0;
//				}
//			}
//		}
		
		
		/*
		 * Version 1.1
		 */
//		if (time1.toUniversalString().compareToIgnoreCase(time2.toUniversalString()) < 0) {
//			return -1;
//		} else if (time1.toUniversalString().compareToIgnoreCase(time2.toUniversalString()) > 0) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		
		/*
		 * Version 1.2
		 */
		return (int) Math.signum(time1.toUniversalString().compareTo(time2.toUniversalString()));
		
	}

}
