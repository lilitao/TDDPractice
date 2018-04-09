package org.ay.tdd.stu;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SquareTest {

	private Shape circle;
	@Before
	public void  init() {
		circle = new Square(3);
	}
	
	@Test
	public void shoud_be_9_with_3() {
		Assert.assertEquals(9d, circle.calArea());
	}
}
