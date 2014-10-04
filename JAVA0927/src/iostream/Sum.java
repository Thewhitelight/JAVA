package iostream;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		input.close();
		swap(n, m);
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				sum++;
			}
		}
		System.out.println(sum);
		for (int i = 0; i < n; i++) {
			System.out.print(sum+" ");
		}
	}

	private static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}
}
