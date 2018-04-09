package org.ay.tdd.parkinglot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {

	private ParkingLot parkLot;

	@Test
	public void should_parking_a_car() throws Exception {
		Assert.assertEquals("abc", parkLot.parking("abc"));
	}
	@Test
	public void should_parking_tow_car() throws Exception {
		parkLot.parking("abc");
		Assert.assertEquals("bcd", this.parkLot.parking("bcd"));
	}
	@Test(expected=Exception.class)
	public void should_throw_execption_when_parking_three_car() throws Exception {
		parkLot.parking("abc");
		this.parkLot.parking("bcd");
		this.parkLot.parking("efh");
	}

	@Before
	public void before() {
		parkLot = new ParkingLot(2);
	}
}
