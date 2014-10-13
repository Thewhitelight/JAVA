package com.szq;

import java.util.Scanner;

public class AreaTest {
	public static void main(String[] args) {
		int r = 0, length, height;
		Scanner input = new Scanner(System.in);
		r = input.nextInt();
		length = input.nextInt();
		height = input.nextInt();
		input.close();
		Circle2 circle = new Circle2();
		circle.setR(r);
		circle.area();
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(height);
		rectangle.setLength(length);
		rectangle.area();
	}
}

abstract class Shape {
	abstract void area();
}

class Circle2 extends Shape {
	int r;

	public void setR(int r) {
		this.r = r;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println(Math.PI * r * r);
	}

}

class Rectangle extends Shape {
	int length, height;

	public void setLength(int length) {
		this.length = length;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println(length * height);
	}

}