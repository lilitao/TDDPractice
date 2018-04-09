package org.ay.tdd.stu;

public class Circle implements Shape{
	
	private double radius ;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calArea() {
		return radius*3.14;
	}


}
