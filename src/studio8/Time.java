package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Time {

	//Create instance variables
	private int hours, minutes;
	private boolean military;

	//Create constructor
	public Time(int hours, int minutes, boolean military) {
		this.hours = hours;
		this.minutes = minutes;
		this.military = military;
	}

	//Generate hash code and equals
	@Override
	public int hashCode() {
		return Objects.hash(hours, military, minutes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hours == other.hours && military == other.military && minutes == other.minutes;
	}



	//Generate getters and setters
	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMilitary(boolean military) {
		this.military = military;
	}

	//generate toString
	@Override
	public String toString() {
		if (military ==true){
			return "Time [hours=" + hours + ", minutes=" + minutes + "]";
		}
		else {
			if (hours>12) {
				return "Time [hours=" + hours%12 + ", minutes=" + minutes + " pm " + "]";
			}
			else {
				return "Time [hours=" + hours%12 + ", minutes=" + minutes + " am " + "]";
			}
		}
	}

	public static void main(String[] args) {
		HashSet<Time> set1 = new HashSet<Time>();
		Time t1 = new Time(13,25,true);
		Time t2 = new Time(10,21,false);
		Time t3 = new Time(5,56,false);
		Time t4 = new Time(21,37,false);
		Time t5 = new Time(8,45,true);
		set1.add(t1);
		set1.add(t2);
		set1.add(t3);
		set1.add(t4);
		set1.add(t5);
		System.out.println(set1);


	}



}