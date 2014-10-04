package iostream;

import java.util.Scanner;

public class IntArrayandCharArray {
	public static void main(String[] args) {
		System.out.print("请输入要输入的整数个数");
		Scanner input = new Scanner(System.in);
		int[] array;
		array = new int[input.nextInt()];
		System.out.println("要输入" + array.length + "个整数,请开始");
		for (int i = 0; i < array.length; i++) {
			int num = input.nextInt();
			array[i] = num;
		}
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
		// 字符数组输入
		System.out.println("请输入要输入的字符数组个数");
		int chararray = input.nextInt();
		String[] S = new String[chararray];
		System.out.println("要输入" + chararray + "个字符数组，请开始");
		for (int i = 0; i < chararray; i++) {
			String str = input.next();
			S[i] = str;
		}
		for (int j = 0; j < S.length; j++) {
			System.out.print(S[j] + " ");
		}
		input.close();
	}
}
