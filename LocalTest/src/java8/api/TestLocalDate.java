package java8.api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

class TestLocalDate {

	public static void main(String[] args) {
		
		// 取当前日期：
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		// 根据年月日取日期，12月就是12：
		LocalDate crischristmas = LocalDate.of(2014, 12, 25); // -> 2014-12-25
		System.out.println(crischristmas);
		
		// 根据字符串取：
		LocalDate endOfFeb = LocalDate.parse("2014-02-28"); // 严格按照ISO yyyy-MM-dd验证，02写成2都不行，当然也有一个重载方法允许自己定义格式
		LocalDate.parse("2014-02-29"); // 无效日期无法通过：DateTimeParseException: Invalid date
		System.out.println(endOfFeb);
		
		
		//日期转换经常遇到，比如：
		// 取本月第1天：
		LocalDate firstDayOfThisMonth = today.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(firstDayOfThisMonth);
		
		// 取本月第2天：
		LocalDate secondDayOfThisMonth = today.withDayOfMonth(2);
		System.out.println(secondDayOfThisMonth);
		
		// 取本月最后一天，再也不用计算是28\29\30还是31：
		LocalDate lastDayOfThisMonth = today.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(lastDayOfThisMonth);
		
		// 取下一天：
		LocalDate firstDayOf2015 = lastDayOfThisMonth.plusDays(1);
		System.out.println(firstDayOf2015);
		
		// 取2015年1月第一个周一，这个计算用Calendar要死掉很多脑细胞：
		LocalDate firstMondayOf2015 = LocalDate.parse("2015-01-01").with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // 2015-01-05
		System.out.println(firstMondayOf2015);
		
		
		
	}

}
