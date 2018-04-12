package org.ay.tdd.parkinglot;

import java.util.List;

public class SuperParkingBoy {

	List<ParkingLot> parkingLots;
	public SuperParkingBoy(List<ParkingLot> asList) {
		this.parkingLots = asList;
	}

	public Token parking(Car car) {
		ParkingLot availableParkingLot = findAavailableParkingLot();
		return availableParkingLot.parking(car);
	}

	private ParkingLot findAavailableParkingLot() {
		for (ParkingLot parkingLot : parkingLots) 
			if(parkingLot.getAvailableParkingSpace() > 0 && isMoastVancancyRate(parkingLot)) 
					return parkingLot;
			
		
		throw new ParkingLotFullException("available parking lot not found");
	}

	private boolean isMoastVancancyRate(ParkingLot parkingLot) {
		for (ParkingLot lot : parkingLots) {
			if(lot.getAvailableParkingSpace() / lot.getSpaceSize() > parkingLot.getAvailableParkingSpace() / parkingLot.getSpaceSize())
				return false;
		}
		return true;
	}

}
