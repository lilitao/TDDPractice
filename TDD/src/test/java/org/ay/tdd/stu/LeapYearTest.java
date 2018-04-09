package org.ay.tdd.stu;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {

	@Test
	public void Leap_year_with_0() {
		int year = 0;
		LeapYear leapYear = new LeapYear();
		assertTrue(!leapYear.isLeapYear(year));
	}
	
	@Test
	public void Leap_year_with_1991() {
		int year = 1991;
		LeapYear leapYear = new LeapYear();
		assertTrue(!leapYear.isLeapYear(year));
	}

	@Test
	public void Leap_year_with_1996() {
		int year = 1996;
		LeapYear leapYear = new LeapYear();
		assertTrue(leapYear.isLeapYear(year));
	}

	@Test
	public void Leap_year_with_2000() {
		int year = 2000;
		LeapYear leapYear = new LeapYear();
		assertTrue(leapYear.isLeapYear(year));
	}

	@Test
	public void Leap_year_with_1700() {
		int year = 1700;
		LeapYear leapYear = new LeapYear();
		assertTrue(!leapYear.isLeapYear(year));
	}
}
