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
		GregorianCalendar GCdate = new GregorianCalendar(year, month-1, day);
		this.year = GCdate.get(Calendar.YEAR);
		this.month = GCdate.get(Calendar.MONTH)+1;
		this.day = GCdate.get(Calendar.DATE);
	}
	
	// =============setter==============
	public void setDate(long elapsedTime) {
		GregorianCalendar GCdate = new GregorianCalendar();
		GCdate.setTimeInMillis(elapsedTime);
		this.year = GCdate.get(Calendar.YEAR);
		this.month = GCdate.get(Calendar.MONTH)+1;
		this.day = GCdate.get(Calendar.DATE);
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
	
}
