package org.ay.tdd.parkinglot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {

	private ParkingLot parkLot;

	@Test
	public void should_parking_a_car(){
		Assert.assertNotNull( this.parkLot.parking(new Car()));
	}
	@Test
	public void should_parking_tow_car(){
		//give
		this.parkLot.parking(new Car());
		
		Assert.assertNotNull(this.parkLot.parking(new Car()));
	}
	@Test(expected=ParkingLotFullException.class)
	public void should_fail_give_full_of_parkinglot(){
		//give
		this.parkLot.parking(new Car());
		this.parkLot.parking(new Car());
		
		this.parkLot.parking(new Car());
	}
	
	@Test
	public void should_take_car_from_parkinglot(){
		Car car = new Car();
		Token token = this.parkLot.parking(car);
		
		Assert.assertEquals(car,this.parkLot.takeCar(token));
	}
	
	@Test(expected=ParkingLotNotCarFoundException.class)
	public void should_fail_when_take_a_car_twice(){
		//give
		Token token = 	this.parkLot.parking(new Car());
		
		this.parkLot.takeCar(token);
		this.parkLot.takeCar(token);
	}
	
	@Test(expected=ParkingLotNotCarFoundException.class)
	public void should_fail_when_take_car_from_empty_parkinglot(){
		this.parkLot.takeCar(new Token());
	}
	
	@Test
	public void should_return_number_of_parking_space()  {
		this.parkLot.parking(new Car());
		
		Assert.assertEquals(1, this.parkLot.getAvailableParkingSpace());
	}
	@Test
	public void should_return_2_when_empty_parking_log() {
		Assert.assertEquals(2, this.parkLot.getAvailableParkingSpace());
	}
	@Test
	public void should_return_1_when_take_a_car_from_2_car_parkinglot() {
		//give
		this.parkLot.parking(new Car());
		Token token = this.parkLot.parking(new Car());
		
		//when
		this.parkLot.takeCar(token);
		//then
		Assert.assertEquals(1, this.parkLot.getAvailableParkingSpace());
		
	}

	@Before
	public void before() {
		parkLot = new ParkingLot(2);
	}
}
