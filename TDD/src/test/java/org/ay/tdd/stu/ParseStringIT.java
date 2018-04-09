package org.ay.tdd.stu;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ParseStringIT {

	@Test
	public void shoud_be_stu_from_str() {
		String str="[[\"zhang san\",\"1\",\"2\",\"3\",\"4\"]]";
		List<Student> stus = ParseString.parseStu(str);
		Assert.assertEquals(stus.get(0).getName(), "zhang san");
		Assert.assertEquals(stus.get(0).getChineseScore(), 1d);
		Assert.assertEquals(stus.get(0).getEnglishScore(), 2d);
		Assert.assertEquals(stus.get(0).getMathScore(), 3d);
		Assert.assertEquals(stus.get(0).getProgramScore(), 4d);
	}
	
	@Test
	public void shoud_be_stus_from_str() {
		String str="[[\"zhang san\",\"1\",\"2\",\"3\",\"4\"],[\"li si\",\"11\",\"21\",\"31\",\"41\"]]";
		List<Student> stus = ParseString.parseStu(str);
		Assert.assertEquals(stus.get(0).getName(), "zhang san");
		Assert.assertEquals(stus.get(0).getChineseScore(), 1d);
		Assert.assertEquals(stus.get(0).getEnglishScore(), 2d);
		Assert.assertEquals(stus.get(0).getMathScore(), 3d);
		Assert.assertEquals(stus.get(0).getProgramScore(), 4d);
		Assert.assertEquals(stus.get(1).getName(), "li si");
		Assert.assertEquals(stus.get(1).getChineseScore(), 11d);
		Assert.assertEquals(stus.get(1).getEnglishScore(), 21d);
		Assert.assertEquals(stus.get(1).getMathScore(), 31d);
		Assert.assertEquals(stus.get(1).getProgramScore(), 41d);
	}
	
	@Test
	public void shoud_reoport_from_stu() {
		List<Student> stus = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setName("a");s1.setChineseScore(1d);s1.setEnglishScore(2d);s1.setMathScore(3d);s1.setProgramScore(4d);
		stus.add(s1);
		ClassScoreReport report = ParseString.generateReport(stus);
		Assert.assertEquals(10, report.getTotalScore());
		Assert.assertEquals(10d, report.getMedianScore());
		
	}
	
	@Test
	public void shoud_be_print_from_report() {
		List<Student> stus = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setName("a");s1.setChineseScore(1d);s1.setEnglishScore(2d);s1.setMathScore(3d);s1.setProgramScore(4d);
		stus.add(s1);
		ClassScoreReport report = ParseString.generateReport(stus);
		
		String result = ParseString.print(report);
		System.out.println(result);
	}
}
