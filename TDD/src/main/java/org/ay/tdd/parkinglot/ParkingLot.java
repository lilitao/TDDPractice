package org.ay.tdd.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
	private int size;
	List<String> number;

	public ParkingLot(int size) {
		this.number = new ArrayList<String>();
		this.size = size;
	}

	public String parking(String carNumber)throws Exception {
		if(this.number.size() >= size) {
			throw new Exception();
		}
		this.number.add(carNumber);
		return  carNumber;
	}

}
