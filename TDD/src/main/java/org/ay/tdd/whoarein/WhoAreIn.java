package org.ay.tdd.whoarein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhoAreIn {

	public static String[] inArray(String[] a, String[] b) {
		if(null == a || null == b) {
			return new String[] {};
		}
		
		if(a.length == 0) {
			return new String[] {};
		}
		
		List<String> result = new ArrayList();
		for (String bStr : b) {
			for (String aStr: a) {
				if(bStr.indexOf(aStr ) > -1){
					if(!result.contains(aStr)) {
						result.add(aStr);	
					}
				}
			}
		}
		
		return result.toArray(new String[] {});
	}

}
