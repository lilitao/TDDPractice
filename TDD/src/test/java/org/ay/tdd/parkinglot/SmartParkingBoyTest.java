package org.ay.tdd.parkinglot;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;


public class SmartParkingBoyTest {

	@Test
	public void should_park_2_car_success_give_smart_parking_boy() {
		//give
		ParkingLot alot = new ParkingLot(1);
		ParkingLot blot = new ParkingLot(1);
		SmartParkingBoy boy = new SmartParkingBoy(Arrays.asList(alot, blot));
		//when
		boy.parking(new Car());
		boy.parking(new Car());
		//then
		assertEquals(0, alot.getAvailableParkingSpace());
		assertEquals(0, blot.getAvailableParkingSpace());
		
	}
	
	@Test
	public void should_park_a_car_to_most_space_parkinglot() {
		//give
		ParkingLot alot = new ParkingLot(1);
		ParkingLot blot = new ParkingLot(2);
		SmartParkingBoy boy = new SmartParkingBoy(Arrays.asList(alot, blot));
		//when
		Car car = new Car();
		Token token = boy.parking(car);
		//then
		assertEquals(car, blot.takeCar(token));
	}
	
	@Test
	public void should_park_a_car_to_anther_most_space_parkinglot() {
		//give
		ParkingLot alot = new ParkingLot(2);
		ParkingLot blot = new ParkingLot(1);
		SmartParkingBoy boy = new SmartParkingBoy(Arrays.asList(alot, blot));
		//when
		Car car = new Car();
		Token token = boy.parking(car);
		//then
		assertEquals(car, alot.takeCar(token));
	}
	
	@Test(expected=ParkingLotFullException.class)
	public void should_fail_give_full_of_parkinglot() {
		//give
		ParkingLot alot = new ParkingLot(1);
		ParkingLot blot = new ParkingLot(1);
		SmartParkingBoy boy = new SmartParkingBoy(Arrays.asList(alot, blot));
		//when then
		boy.parking(new Car());
	}
}
