package org.ay.tdd.stu;

public class LeapYear {

	public static boolean isLeapYear(int year) {
		if(year <= 0) {
			return false;
		}
		if(year%4 == 0) {
			if(year%100 == 0 && year%400 != 0) {
				return false;
			}
		}else {
			return false;
		}
		
		return true;
	}
}
