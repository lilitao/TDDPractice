package org.ay.tdd.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
	private int size = 0;
	private Map<Token,Car> licencePlates;

	public ParkingLot(int size) {
		this.licencePlates = new HashMap<Token, Car>();
		this.size = size;
	}

	public synchronized Token parking(Car car)throws ParkingLotException {
		if(this.licencePlates.size() >= size) {
			throw new ParkingLotFullException("parking lot had no parking space");
		}
		Token token = new Token();
		this.licencePlates.put(token,car);
		return  token;
	}

	public synchronized Car takeCar(Token token) throws ParkingLotException {
		if(this.licencePlates.containsKey(token)) {
			return this.licencePlates.remove(token);
		}else {
			throw new ParkingLotNotCarFoundException("no that car:"+token); 
		}
		
	}

	public int getAvailableParkingSpace() {
		return this.size - this.licencePlates.size();
	}
	
	public boolean contain(Token token) {
		
		return this.licencePlates.containsKey(token);
	}


}
