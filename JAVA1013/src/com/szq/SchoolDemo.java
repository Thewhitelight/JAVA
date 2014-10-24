package com.szq;

import java.util.Scanner;

public class SchoolDemo {
	static School school[] = new School[] { new School("台州中学", 001),
			new School("临海中学", 002), new School("回浦中学", 003) };
	static Students students[] = new Students[] { new Students("张三", 001, 001),
			new Students("李四", 002, 002), new Students("王五", 003, 003) };

	public static void main(String[] args) {
		System.out.println("请输入姓名：");
		Scanner input = new Scanner(System.in);
		String names = input.next();
		input.close();
		getsName(names);
	}

	public static void getsName(String name) {
		int sNumber = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getName().equals(name)) {
				sNumber = students[i].getsNumber();
				break;
			}
		}
		for (int i = 0; i < school.length; i++) {
			if (school[i].getsNumber() == sNumber) {
				System.out.println(school[i].getsName());
				break;
			}
		}
	}
}

class School {
	String sName;
	int sNumber;

	public School(String sName, int sNumber) {
		// TODO Auto-generated constructor stub
		this.sName = sName;
		this.sNumber = sNumber;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsNumber() {
		return sNumber;
	}
	public void setsNumber(int sNumber) {
		this.sNumber = sNumber;
	}
}

class Students {
	String name;
	int number;
	int sNumber;

	public Students(String name, int number, int sNumber) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.number = number;
		this.sNumber = sNumber;
	}

	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public int getsNumber() {
		return sNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setsNumber(int sNumber) {
		this.sNumber = sNumber;
	}
}
