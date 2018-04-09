package org.ay.tdd.stu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class ParseString {

	public static List<Student> parseStu(String str) {
		List<Student> stus = new ArrayList<Student>();
		JSONArray arrays = JSONObject.parseArray(str);
		for(Object item : arrays) {
			JSONArray student = (JSONArray)item;
			Student stu = new Student();
			stu.setName((String)student.get(0));
			stu.setChineseScore(Double.parseDouble((String)student.get(1)));
			stu.setEnglishScore(Double.parseDouble((String)student.get(2)));
			stu.setMathScore(Double.parseDouble((String)student.get(3)));
			stu.setProgramScore(Double.parseDouble((String)student.get(4)));
			stus.add(stu);
		}
		return stus;
	}
	
	public static ClassScoreReport generateReport(List<Student> studentList) {
		double totalScore = 0, medianScore = 0;
		
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getTotalScore() > o2.getTotalScore()) {
					return 1;
				}
				if(o1.getTotalScore() < o2.getTotalScore()) {
					return -1;
				}
				return 0;
			}
		});
		Double mid = 0d;
		if(studentList.size() %2 == 0) {
			int i = studentList.size() / 2;
			double m1 = studentList.get(i++).getTotalScore();
			double m2 = studentList.get(i).getTotalScore();
			mid = (m1 +m2) /2;
		}else {
			mid = studentList.get(studentList.size() / 2).getTotalScore();
		}
		for(Student stu : studentList) {
			totalScore += stu.getTotalScore();
		}
		ClassScoreReport report = new ClassScoreReport();
		report.setMedianScore(mid);
		report.setTotalScore(totalScore/studentList.size());
		report.setStudentScoreItems(studentList);
		return report;
	}

	public static String print(ClassScoreReport report) {
		StringBuilder result = new StringBuilder();
		result.append("成绩单\n姓名|数学|语文|英语|编程|平均分|总分\n=====================\n");
		for(Student student : report.getStudentScoreItems()) {
			result.append(student.getName()).append("|");
			result.append(student.getMathScore()).append("|");
			result.append(student.getChineseScore()).append("|");
			result.append(student.getEnglishScore()).append("|");
			result.append(student.getMathScore()).append("|");
			result.append(student.getAverageScore()).append("|");
			result.append(student.getTotalScore()).append("\n");
		}
		result.append("=====================\n全班总平均分: ").append(report.getTotalScore()).append("\n");
		result.append("全班总平分中位: ").append(report.getMedianScore());
		//System.out.print(result.toString());
		return result.toString();
	}

}
