package org.ay.tdd.parkinglot;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SuperParkingBoyTest {

	@Test
	public void should_park_2_car_success_give_super_parking_boy() {
		//give
		ParkingLot alot = new ParkingLot(1);
		ParkingLot blot = new ParkingLot(1);
		SuperParkingBoy boy = new SuperParkingBoy(Arrays.asList(alot,blot));
		//when
		boy.parking(new Car());
		boy.parking(new Car());
		//then
		assertEquals(0, alot.getAvailableParkingSpace());
		assertEquals(0, blot.getAvailableParkingSpace());
	}
	
	@Test
	public void should_park_a_car_to_biggest_vancancy_rate() {
		//give
		ParkingLot alot = new ParkingLot(2);
		ParkingLot blot = new ParkingLot(5);
		SuperParkingBoy boy = new SuperParkingBoy(Arrays.asList(alot,blot));
		alot.parking(new Car());
		blot.parking(new Car());
		blot.parking(new Car());
		blot.parking(new Car());
		//when
		boy.parking(new Car());
		//then
		assertEquals(0, alot.getAvailableParkingSpace());
		assertEquals(2, blot.getAvailableParkingSpace());
	}
	
	@Test
	public void should_park_a_car_to_anther_biggest_vancancy_rate() {
		//give
		ParkingLot alot = new ParkingLot(5);
		ParkingLot blot = new ParkingLot(2);
		SuperParkingBoy boy = new SuperParkingBoy(Arrays.asList(alot,blot));
		alot.parking(new Car());
		alot.parking(new Car());
		alot.parking(new Car());
		blot.parking(new Car());
		//when
		boy.parking(new Car());
		//then
		assertEquals(2, alot.getAvailableParkingSpace());
		assertEquals(0, blot.getAvailableParkingSpace());
	}
	
	@Test(expected=ParkingLotFullException.class)
	public void should_fail_give_full_of_parkinglot() {
		//give
		ParkingLot alot = new ParkingLot(1);
		ParkingLot blot = new ParkingLot(1);
		SuperParkingBoy boy = new SuperParkingBoy(Arrays.asList(alot, blot));
		//when then
		boy.parking(new Car());
	}
}
