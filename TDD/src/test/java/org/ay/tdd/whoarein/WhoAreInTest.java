package org.ay.tdd.whoarein;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WhoAreInTest {

	
	private String[] aParm;
	private String[] bParm;
	private String[] result;
	
	public static class WhoAreInTestParam{
		private String[] aParm;
		private String[] bParm;
		private String[] result;
		public WhoAreInTestParam(String[] aParm,String[] bParm,String[] result) {
			this.aParm = aParm;
			this.bParm = bParm;
			this.result = result;
		}
	}
	
	
	public WhoAreInTest(WhoAreInTestParam par) {
		this.aParm = par.aParm;
		this.bParm = par.bParm;
		this.result = par.result;
		
	}
	
	
	@Parameters
	public static List<WhoAreInTestParam> userDatas() {
		return Arrays.asList(new WhoAreInTestParam[] {
				new WhoAreInTestParam(new String[] {"arp"}, new String[] {"arp","aia"},new String[]{"arp"}),
				new WhoAreInTestParam(new String[] {}, new String[] {"arp","aia"},new String[]{}),
				new WhoAreInTestParam(null, null,new String[]{}),
				new WhoAreInTestParam(new String[] {"bib"}, new String[] {"arp","aia"},new String[]{}),
				new WhoAreInTestParam(new String[] {"arp"}, new String[] {"arp","aia","arp"},new String[]{"arp"}),
				new WhoAreInTestParam(new String[] {"arp"}, new String[] {"subarp","aia","arp"},new String[]{"arp"}),
		});
	}
	
	@Test
	public void should_return_arp() {
		
		Assert.assertArrayEquals(result, WhoAreIn.inArray(aParm,bParm));
	}
	
}
