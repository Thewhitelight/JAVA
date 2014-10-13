package com.szq;

import java.util.Scanner;

public class Circle {
	double cirlceX;
	double circleY;
	static boolean yes;
	static Scanner input = new Scanner(System.in);
	static double x1 = input.nextDouble();
	static double x2 = input.nextDouble();
	static double y1 = input.nextDouble();
	static double y2 = input.nextDouble();
	static double d = input.nextDouble();
	static Point point = new Point(x1, y2);
	static Circle circle = new Circle(x2, y2);

	public Circle(double circleX, double circleY) {
		this.circleY = circleX;
		this.circleY = circleY;
	}

	private static boolean distance(Point point, Circle circle) {
		// TODO Auto-generated method stub
		yes = true;
		if (Math.sqrt((point.pointX - circle.cirlceX)
				* (point.pointX - circle.cirlceX)
				+ (point.pointY - circle.circleY)
				* (point.pointY - circle.circleY)) <= d) {
			return yes;
		} else
			return yes = false;
	}

	public static void main(String[] args) {
		distance(point, circle);
		System.out.println(yes);
	}
}

class Point {
	double pointX;
	double pointY;

	public Point(double pointX, double pointY) {
		// TODO Auto-generated constructor stub
		this.pointX = pointX;
		this.pointX = pointY;
	}

	public void setPointX(double pointX) {
		this.pointX = pointX;
	}

	public void setPointY(double pointY) {
		this.pointY = pointY;
	}
}