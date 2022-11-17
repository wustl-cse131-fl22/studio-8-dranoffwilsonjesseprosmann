package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Date {
	private int month, day, year;
	private boolean holiday;


    public Date(int month, int day, int year, boolean holiday) {
		
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}


	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && holiday == other.holiday && month == other.month && year == other.year;
	}


	public int getMonth() {
		return month;
	}


	public int getDay() {
		return day;
	}


	public int getYear() {
		return year;
	}


	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}


	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", holiday=" + holiday + "]";
	}

	
	

	public static void main(String[] args) {
		
		/*
		LinkedList<Date> list = new LinkedList<Date>();
		
		Date d1 = new Date(12,25,2001,true);
		Date d2 = new Date(10,21,1999,false);
		Date d3 = new Date(5,6,2021,false);
		Date d4 = new Date(10,31,2003,true);
		Date d5 = new Date(3,31,2003,true);
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		System.out.println(list);
		*/
		
		HashSet<Date> set = new HashSet<Date>();
		Date d1 = new Date(12,25,2001,true);
		Date d2 = new Date(10,21,1999,false);
		Date d3 = new Date(5,6,2021,false);
		Date d4 = new Date(10,31,2003,true);
		Date d5 = new Date(3,31,2003,true);
		set.add(d1);
		set.add(d2);
		set.add(d3);
		set.add(d4);
		set.add(d5);
		System.out.println(set);
		

		

    }

}
