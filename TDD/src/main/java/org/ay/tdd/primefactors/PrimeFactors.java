package org.ay.tdd.primefactors;

import java.util.ArrayList;

import com.google.common.collect.Lists;

public class PrimeFactors {

	public static Integer[] of(int n) {
		ArrayList<Object> factors = Lists.newArrayList();
		for(int divisor = 2;n > 1;divisor++) {
			for(;n %divisor == 0;n /= divisor) {
				factors.add(divisor);
			}
		}
		return factors.toArray(new Integer[] {});
	}
	
	

}
