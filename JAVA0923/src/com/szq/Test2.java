package com.szq;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int count = 0, unitcost = 0;
		double cost = 0;
		buy(count, unitcost, cost);
	}

	private static void buy(int count, int unitcost, double cost) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�����빺��������");

		count = input.nextInt();
		System.out.println("���������ϼ۸�");

		unitcost = input.nextInt();
		if (count / 2 == 0) {
			cost = count / 2 * unitcost + count / 2 * (unitcost / 2.0);
		}
		if (count / 2 != 0) {
			cost = count / 2 * (unitcost / 2.0) + (count - count / 2)
					* unitcost;
		}
		System.out.println("Ӧ���۸�" + cost);
		input.close();
	}
}
