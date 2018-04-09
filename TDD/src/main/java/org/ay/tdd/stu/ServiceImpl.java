package org.ay.tdd.stu;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl {
	private List<Character> vows = new ArrayList<Character>();
	private static final String replace_text = "mommy";
	
	public ServiceImpl() {
		vows.add('a');
		vows.add('i');
		vows.add('o');
		vows.add('u');
		vows.add('e');
	}
	public String replaceStr(String str) {
		String result = "";
		if(str == null || "".equals(str)) {
			return str;
		}else {
			float hitCount = 0;
			for(char c:str.toCharArray()) {
				if(vows.contains(c)) {
					hitCount++;
					result += replace_text;
				}else {
					result += c;
				}
				
			}
			if(str.length()/hitCount <= 0.3) {
				return str;
			}
			
		}
		return result;
	}
}
