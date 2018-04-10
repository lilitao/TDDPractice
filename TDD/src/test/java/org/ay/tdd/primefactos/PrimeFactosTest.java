package org.ay.tdd.primefactos;

import java.util.Arrays;

import org.ay.tdd.primefactors.PrimeFactors;
import org.junit.Assert;
import org.junit.Test;

public class PrimeFactosTest {

	@Test
	public void of_1_is_none() {
		Assert.assertArrayEquals(PrimeFactors.of(1), new Integer[] {});
	}
	
	@Test
	public void of_2_is_2() {
		Assert.assertArrayEquals(PrimeFactors.of(2), new Integer[] {2});
	}
	
	@Test
	public void of_3_is_3() {
		Assert.assertArrayEquals(PrimeFactors.of(3), new Integer[] {3});
		
	}
	
	@Test 
	public void of_4_is_2_2() {
		Assert.assertArrayEquals(PrimeFactors.of(4), new Integer[] {2,2});
		
	}
	@Test
	public void of_6_is_2_3() {
		Assert.assertArrayEquals(PrimeFactors.of(6), new Integer[] {2,3});
	}
	@Test
	public void of_8_is_2_2_2() {
		Assert.assertArrayEquals(PrimeFactors.of(8), new Integer[] {2,2,2});
	}
	
	@Test
	public void of_9_is_3_3() {
		Assert.assertArrayEquals(PrimeFactors.of(9), new Integer[] {3,3});
	}
	
	@Test
	public void of_common_test() {
		Assert.assertArrayEquals(PrimeFactors.of(2*3*5*7*11), new Integer[] {2,3,5,7,11});
	}
}
