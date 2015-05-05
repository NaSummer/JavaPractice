package assignment4;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * The data fields year, month and day that represent a date. (1 for January)
 * A no-arg constructor that creates a MyDate object for the current date. 
 * A constructor that constructs a MyDate object with a specified elapsed time since midnight, January 1, 1970, in milliseconds. 
 * A constructor that constructs a MyDate object with the specified year, month, and day. 
 * Three get methods for the data fields year, month, and day, respectively.
 * A method named setDate(long elapsedTime) that sets a new date for the object using the elapsed time. 
 * 
 */

class MyDate {
	
	private int year;
	private int month;
	private int day;
	
	// =============Contractor==============
	public MyDate() {
		// current date
		GregorianCalendar GCdate = new GregorianCalendar();
		this.year = GCdate.get(Calendar.YEAR);
		this.month = GCdate.get(Calendar.MONTH)+1;
		this.day = GCdate.get(Calendar.DATE);
	}
	
	public MyDate(long elapsedTimeInMillis) {
		GregorianCalendar GCdate = new GregorianCalendar();
		GCdate.setTimeInMillis(elapsedTimeInMillis);
		this.year = GCdate.get(Calendar.YEAR);
		this.month = GCdate.get(Calendar.MONTH)+1;
		this.day = GCdate.get(Calendar.DATE);
	}
	
	public MyDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	// =============setter==============
	public void setDate(long elapsedTime) {
		GregorianCalendar GCdate = new GregorianCalendar();
		GCdate.setTimeInMillis(elapsedTime);
		this.year = GCdate.get(Calendar.YEAR);
		this.month = GCdate.get(Calendar.MONTH)+1;
		this.day = GCdate.get(Calendar.DATE);
	}
	
	// =========private setter==========
	private void setYear(int year) {
		this.year = year;
	}

	private void setMonth(int month) {
		if ( (month>=1)&&(month<=12) ) {
			this.month = month;
		} else {
			System.err.println("Enter the wrong date.");
		}
	}

	private void setDay(int day) {
		if (this.month>0) {
			
			switch (this.month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (day<=31) {
					this.day = day;
				} else {
					System.err.println("Enter the wrong date.");
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (day<=30) {
					this.day = day;
				} else {
					System.err.println("Enter the wrong date.");
				}
				break;
			case 2:
				if ( ((isLeapYear(this.year))&&(day<=29)) || ((!isLeapYear(this.year))&&(day<=28)) ) {
					this.day = day; 
				} else {
					System.err.println("Enter the wrong date.");
				}
				break;
			default:
				System.err.println("Enter the wrong date.");
				break;
			}
			
		} else {			
			System.err.println("Enter the wrong date.");
		}

	}
	
	// =============getter==============
	public int getYear() {
		return this.year;
	}

	public int getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;
	}
	
	// ============Tool=================
	private boolean isLeapYear(int year) {
		if (year%4==0) {
			if (year%100==0) {
				if (year%400==0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
	
}
