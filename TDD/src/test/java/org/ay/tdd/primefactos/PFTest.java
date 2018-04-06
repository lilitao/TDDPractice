package org.ay.tdd.primefactos;

import org.junit.Assert;
import org.junit.Test;

public class PFTest {

	@Test
	public void should_1_is_none() {
		Assert.assertArrayEquals(PE.of(1), new Integer[] {});
	}
	
	@Test
	public void should_2_is_2() {
		Assert.assertArrayEquals(PE.of(2), new Integer[] {2});
	}
	
	@Test
	public void should_3_is_3() {
		Assert.assertArrayEquals(PE.of(3), new Integer[] {3});
	}
	
	@Test
	public void should_4_is_2_2() {
		Assert.assertArrayEquals(PE.of(4), new Integer[] {2,2});
	}
	
	
}
