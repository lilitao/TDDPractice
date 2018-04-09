package org.ay.tdd.stu;

import java.util.List;

public class ClassScoreReport {
	
	private List<Student> studentScoreItems;
	
	private double totalScore;
	
	private double medianScore;

	public List<Student> getStudentScoreItems() {
		return studentScoreItems;
	}

	public void setStudentScoreItems(List<Student> studentScoreItems) {
		this.studentScoreItems = studentScoreItems;
	}

	public double getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(double totalScore) {
		this.totalScore = totalScore;
	}

	public double getMedianScore() {
		return medianScore;
	}

	public void setMedianScore(double medianScore) {
		this.medianScore = medianScore;
	} 
	
	

}
