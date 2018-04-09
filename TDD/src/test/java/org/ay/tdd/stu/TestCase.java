package org.ay.tdd.stu;

import org.junit.Test;

import junit.framework.Assert;

public class TestCase {
	
	@Test
	public void testStrBland() {
		String str = "";
		ServiceImpl service = new ServiceImpl();
		String result = service.replaceStr(str);
		Assert.assertEquals(result, "");
	}
	
	@Test
	public void testStra() {
		String str = "a";
		ServiceImpl service = new ServiceImpl();
		String result = service.replaceStr(str);
		Assert.assertEquals(result, "mommy");
	}
	
	/*@Test
	public void testStrb() {
		String str = "b";
		ServiceImpl service = new ServiceImpl();
		String result = service.replaceStr(str);
		Assert.assertEquals(result, "b");
	}*/

}
