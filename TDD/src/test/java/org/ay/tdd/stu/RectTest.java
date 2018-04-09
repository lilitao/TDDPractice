package org.ay.tdd.stu;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class RectTest {
	private Shape rect;
	
	@Before
	public void init() {
		rect = new Rect(2,3);
	}
	
	@Test
	public void testArea() {
		Assert.assertEquals(6, rect.calArea());
	}

}
