package org.ay.tdd.parkinglot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SmartParkingBoy {
	List<ParkingLot> parkingLots;

	public SmartParkingBoy(List<ParkingLot> lots) {
		parkingLots = lots;
	}

	public Token parking(Car car) {
		ParkingLot parkingLot = findAvailableParkingLot();
		return parkingLot.parking(car);
		
	}

	private ParkingLot findAvailableParkingLot() {
		for (ParkingLot parkingLot : parkingLots) {
			if(parkingLot.getAvailableParkingSpace() > 0 && isMostAvailableParkingSpace(parkingLot)) 
					return parkingLot;
		}
		throw new ParkingLotFullException("available parking lot not found");
	}

	private boolean isMostAvailableParkingSpace(ParkingLot parkingLot) {
		for (ParkingLot lot : parkingLots) {
			if(parkingLot.getAvailableParkingSpace() < lot.getAvailableParkingSpace())
				return false;
		}
		return true;
	}

}
