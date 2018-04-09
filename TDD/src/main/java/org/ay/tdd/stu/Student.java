package org.ay.tdd.stu;

public class Student {
	
	private String name;
	
	private double ChineseScore;
	private double englishScore;
	private double mathScore;
	private double programScore;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getChineseScore() {
		return ChineseScore;
	}
	public void setChineseScore(double chineseScore) {
		ChineseScore = chineseScore;
	}
	public double getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(double englishScore) {
		this.englishScore = englishScore;
	}
	public double getMathScore() {
		return mathScore;
	}
	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}
	public double getProgramScore() {
		return programScore;
	}
	public void setProgramScore(double programScore) {
		this.programScore = programScore;
	}
	
	public double getTotalScore() {
		return this.getChineseScore() + this.getEnglishScore() + this.getMathScore() + this.getProgramScore();
	}

	public double getAverageScore() {
		return this.getTotalScore()/5d;
	}

}
