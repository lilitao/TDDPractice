package org.ay.tdd.parkinglot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ParkingBoy {
	List<ParkingLot> parkingLots = new ArrayList<>();
	
	public void add(ParkingLot lot) {
		this.parkingLots.add(lot);
	}

	public Token parking(Car aCar) {
		if(this.parkingLots.stream()
				.filter(lot -> lot.getAvailableParkingSpace() > 0)
				.collect(Collectors.toList())
				.isEmpty()) {
			throw new ParkingLotFullException("parking lot space is full");
		}
		Optional<ParkingLot> lot = this.parkingLots.stream()
				.filter(p -> p.getAvailableParkingSpace() > 0)
				.findFirst();
		return lot.isPresent() ? lot.get().parking(aCar):null;
	}

	public Car take( Token aToken) {
		Optional<ParkingLot> val =	this.parkingLots.stream().filter(p -> p.contain(aToken)).findFirst();
		return val.isPresent() ? val.get().takeCar(aToken) : null;
		
	}


}
