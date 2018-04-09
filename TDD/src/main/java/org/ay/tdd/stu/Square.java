package org.ay.tdd.stu;

public class Square implements Shape {
	private double width;
	public Square(double width) {
		this.width = width;
	}
	@Override
	public double calArea() {
		return width*width;
	}

}
