package org.ay.tdd.stu;

public class Rect implements Shape{
	
	private int with;
	private int height;

	public Rect(int with, int height) {
		this.with = with;
		this.height = height;
	}

	@Override
	public double calArea() {
		return with*height;
	}

}
