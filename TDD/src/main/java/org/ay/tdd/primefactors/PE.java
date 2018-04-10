package org.ay.tdd.primefactors;

import java.util.ArrayList;

import com.google.common.collect.Lists;

public class PE {

	public static Integer[] of(int n) {
		ArrayList<Object> factors = Lists.newArrayList();
		if(n > 1) {
			if(n % 2 ==0) {
				factors.add(2);
				n /= 2;
			}
		}
		if(n > 1) {
			factors.add(n);
		}
		return factors.toArray(new Integer[] {});
	}

}
