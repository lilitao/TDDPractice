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
	
	@Test
	public void should_take_car_from_parkinglot() throws Exception {
		this.parkLot.parking("abc");
		Assert.assertEquals("abc", this.parkLot.takeCar("abc"));
	}
	
	@Test(expected=Exception.class)
	public void should_exception_when_take_a_car_twice() throws Exception {
		this.parkLot.parking("abc");
		this.parkLot.takeCar("abc");
		this.parkLot.takeCar("abc");
	}
	
	@Test(expected=Exception.class)
	public void should_exception_when_take_car_from_empty_parkinglot() throws Exception {
		this.parkLot.takeCar("abc");
	}
	
	@Test
	public void should_return_number_of_parking_space() throws Exception {
		this.parkLot.parking("abc");
		Assert.assertEquals(1, this.parkLot.getSizeOfParkingSpace());
	}
	@Test
	public void should_return_2_when_empty_parking_log() {
		Assert.assertEquals(2, this.parkLot.getSizeOfParkingSpace());
	}

	@Before
	public void before() {
		parkLot = new ParkingLot(2);
	}
}
