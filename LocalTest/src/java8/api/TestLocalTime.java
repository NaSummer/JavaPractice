package java8.api;

import java.time.LocalTime;

class TestLocalTime {

	public static void main(String[] args) {

		//LocalTime只包含时间，以前用java.util.Date怎么才能只表示时间呢？答案是，假装忽略日期。

		// LocalTime包含毫秒：
		LocalTime now1 = LocalTime.now(); // 11:09:09.240
		System.out.println(now1);
		
		// 你可能想清除毫秒数：
		LocalTime now2 = LocalTime.now().withNano(0); // 11:09:09
		System.out.println(now2);
		
		// 构造时间也很简单：
		LocalTime zero = LocalTime.of(0, 0, 0); // 00:00:00
		LocalTime mid = LocalTime.parse("12:00:00"); // 12:00:00
		System.out.println(zero);
		System.out.println(mid);
		
		// 时间也是按照ISO格式识别，但可以识别以下3种格式：
		// 12:00
		// 12:01:02
		// 12:01:02.345
		
		
		// ======JDBC=====
		// 最新JDBC映射将把数据库的日期类型和Java 8的新类型关联起来：
		// SQL -> Java
		// --------------------------
		// date -> LocalDate
		// time -> LocalTime
		// timestamp -> LocalDateTime
		// 再也不会出现映射到java.util.Date其中日期或时间某些部分为0的情况了。
		
	}

}
