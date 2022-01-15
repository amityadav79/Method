package org.studyeasy;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(area(15.5d, 10.65));
		System.out.println(area(5.0d));
	}
	
	public static double area(double length, double width)
	{
		return length*width;
	}
	
	public static double area(double side) {
        return side*side;
}
	
	public static int area(int side) {
		return side*side;
	}
}