package org.ay.tdd.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
	private int size = 0;
	List<String> number;

	public ParkingLot(int size) {
		this.number = new ArrayList<String>();
		this.size = size;
	}

	public synchronized String parking(String carNumber)throws Exception {
		if(this.number.size() >= size) {
			throw new Exception("parking lot had no parking space");
		}
		this.number.add(carNumber);
		return  carNumber;
	}

	public synchronized String takeCar(String string) throws Exception {
		if(number.contains(string)) {
			number.remove(string);
			return string;
		}else {
			throw new Exception("no that car:"+string);
		}
		
	}

	public int getSizeOfParkingSpace() {
		return size - this.number.size();
	}

}
