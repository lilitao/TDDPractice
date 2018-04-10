package org.ay.tdd.parkinglot;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ParkingLot {
	private int size = 0;
	private List<String> certNo;

	public ParkingLot(int size) {
		this.certNo = new CopyOnWriteArrayList<>();
		this.size = size;
	}

	public synchronized String parking(String carNumber)throws ParkingLotException {
		if(this.certNo.size() >= size) {
			throw new ParkingLotException("parking lot had no parking space");
		}
		this.certNo.add(carNumber);
		return  carNumber;
	}

	public synchronized String takeCar(String string) throws ParkingLotException {
		if(certNo.contains(string)) {
			certNo.remove(string);
			return string;
		}else {
			throw new ParkingLotException("no that car:"+string);
		}
		
	}

	public int getSizeOfParkingSpace() {
		return size - this.certNo.size();
	}

}
