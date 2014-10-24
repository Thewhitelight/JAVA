package com.szq;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		int n = 0;
		double cost = 0;
		Scanner input = new Scanner(System.in);
		while (n < 1 || n > 5) {
			n = input.nextInt();
			if (n >= 1 && n <= 5) {
				pay(n, cost);
			} else {
				System.out.println("请输入1-5之间的数量");
			}
		}
		input.close();
	}

	private static void pay(int count, double cost) {
		// TODO Auto-generated method stub
		if (count == 1) {
			cost = 5;
		} else if (count / 2 == 0) {
			cost = count / 2 * 5 + count / 2 * (5 / 2.0);
		} else if (count / 2 != 0) {
			cost = count / 2 * (5 / 2.0) + (count - count / 2) * 5;
		}
		System.out.println("应付价格：" + cost);

	}

}
