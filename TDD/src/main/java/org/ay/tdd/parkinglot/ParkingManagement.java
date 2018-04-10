package org.ay.tdd.parkinglot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingManagement {
	List<ParkingLot> parkingLots = new ArrayList<>();
	
	public void add(ParkingLot lot) {
		this.parkingLots.add(lot);
	}

	public Token parking(Car aCar) {
		if(this.parkingLots.stream()
				.filter((p) -> p.getAvailableParkingSpace() > 0)
				.collect(Collectors.toList())
				.size() <= 0) {
			throw new ParkingLotFullException("parking lot space is not available");
		}
		return this.parkingLots.stream()
				.filter((p) -> p.getAvailableParkingSpace() > 0)
				.findFirst()
				.get()
				.parking(aCar);
	}


}
