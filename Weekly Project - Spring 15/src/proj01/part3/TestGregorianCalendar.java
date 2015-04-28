package proj01.part3;

import java.util.GregorianCalendar;

class TestGregorianCalendar {

	public static void main(String[] args) {
		
		System.out
				.println("What I want to say to The Sam SAMA is \"You are a good man.\"");
		System.out.println("The day I beat The Sam SAMA is " + getDay());
		System.out
				.println("Humankind: \"You are the hero! We will remember you forever!");
	}

	public static String getDay() {
		GregorianCalendar calendar = new GregorianCalendar();
		String day = "";
		switch (calendar.get(GregorianCalendar.MONTH)) {
		case 0:
			day = "January ";
			break;
		case 1:
			day = "February ";
			break;
		case 2:
			day = "March ";
			break;
		case 3:
			day = "April ";
			break;
		case 4:
			day = "May ";
			break;
		case 5:
			day = "June ";
			break;
		case 6:
			day = "July ";
			break;
		case 7:
			day = "August ";
			break;
		case 8:
			day = "September ";
			break;
		case 9:
			day = "October ";
			break;
		case 10:
			day = "November ";
			break;
		case 11:
			day = "December ";
			break;
			
		default:
			break;
		}
		String dayOfMonth = Integer.toString( calendar.get(GregorianCalendar.DAY_OF_MONTH));
		day = day + dayOfMonth;
		if (dayOfMonth.endsWith("1")) {
			day = day + "st, "+calendar.get(GregorianCalendar.YEAR);
		} else if (dayOfMonth.endsWith("2")) {
			day = day + "nd, "+calendar.get(GregorianCalendar.YEAR);
		} else if (dayOfMonth.endsWith("3")) {
			day = day + "rd, "+calendar.get(GregorianCalendar.YEAR);
		} else {
			day = day + "th, "+calendar.get(GregorianCalendar.YEAR);
		}
		return day;
	}
}
