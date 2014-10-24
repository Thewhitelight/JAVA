package com.szq;

import java.util.Arrays;
import java.util.Random;

public class ForRandomSort {
	public static void main(String[] args) {
		int[] chararr = new int[10];
		Random random = new Random();
		for (int i = 0; i < chararr.length; i++) {
			chararr[i] = random.nextInt(100);// 循环赋值1000以内随机数给charrarr
		}
		System.out.println(Arrays.toString(chararr));
		int[] chararr1 = Arrays.copyOf(chararr, chararr.length);
		Arrays.sort(chararr1);
		System.out.println(Arrays.toString(chararr1));
	}

}
