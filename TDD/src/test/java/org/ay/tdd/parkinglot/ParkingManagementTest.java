package org.ay.tdd.parkinglot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParkingManagementTest {

	@Test
	public void should_park_2_car_to_A_and_B() {
		//give
		ParkingManagement management = new ParkingManagement();
		ParkingLot aLot = new ParkingLot(1);
		ParkingLot bLot = new ParkingLot(1);
		management.add(aLot);
		management.add(bLot);
		
		//when
		Car aCar = new Car();
		Car bCar = new Car();
		Token aToken = management.parking(aCar);
		Token bToken = management.parking(bCar);
		
		//then
		assertEquals(aCar, aLot.takeCar(aToken));
		assertEquals(bCar, bLot.takeCar(bToken));
	}
	
	@Test
	public void should_park_2_car_order_by_A_B() {
		//give
		ParkingManagement management = new ParkingManagement();
		ParkingLot aLot = new ParkingLot(2);
		ParkingLot bLot = new ParkingLot(1);
		management.add(aLot);
		management.add(bLot);
		
		//when
		Car aCar = new Car();
		Car bCar = new Car();
		Token aToken = management.parking(aCar);
		Token bToken = management.parking(bCar);
		
		//then
		assertEquals(aCar, aLot.takeCar(aToken));
		assertEquals(bCar, aLot.takeCar(bToken));
	}
	
	@Test(expected=ParkingLotFullException.class)
	public void should_fail_give_full_of_A_and_B_parkinglot() {
		//give
		ParkingManagement management = new ParkingManagement();
		ParkingLot aLot = new ParkingLot(1);
		ParkingLot bLot = new ParkingLot(1);
		management.add(aLot);
		management.add(bLot);
		management.parking(new Car() );
		management.parking(new Car() );
		//when
		management.parking(new Car());
	}
}
