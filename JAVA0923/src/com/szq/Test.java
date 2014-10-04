package com.szq;

public class Test {
	public static void main(String[] args) {
		int[] a = new int[] { 23, 56, 78, 14, 95, 65, 9, 46 };
		sort(a);
	}

	private static void sort(int[] a) {//ц╟ещеепР
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
	}
}
