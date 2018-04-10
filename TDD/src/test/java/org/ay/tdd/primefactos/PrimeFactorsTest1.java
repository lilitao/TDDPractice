package org.ay.tdd.primefactos;

import org.ay.tdd.primefactors.PrimeFactorsRound1;
import org.junit.Assert;
import org.junit.Test;

public class PrimeFactorsTest1 {

	@Test
	public void should_1_is_none() {
		Assert.assertArrayEquals(PrimeFactorsRound1.of(1), new Integer[] {});
	}
	
	@Test
	public void should_2_is_2() {
		Assert.assertArrayEquals(PrimeFactorsRound1.of(2), new Integer[] {2});
	}
	
	@Test
	public void should_3_is_3() {
		Assert.assertArrayEquals(PrimeFactorsRound1.of(3), new Integer[] {3});
	}
	
	@Test
	public void should_4_is_2_2() {
		Assert.assertArrayEquals(PrimeFactorsRound1.of(4), new Integer[] {2,2});
	}
	
	@Test
	public void should_6_is_2_3() {
		Assert.assertArrayEquals(PrimeFactorsRound1.of(6), new Integer[] {2,3});
	}
	
	@Test
	public void should_8_is_2_2_2() {
		Assert.assertArrayEquals(PrimeFactorsRound1.of(8), new Integer[] {2,2,2});
	}
	
	@Test
	public void should_9_is_3_3() {
		Assert.assertArrayEquals(PrimeFactorsRound1.of(9), new Integer[] {3,3});
	}
	
	@Test
	public void should_common_test() {
		Assert.assertArrayEquals(PrimeFactorsRound1.of(2*3*5*7*11), new Integer[] {2,3,5,7,11});
	}
}
