package iostream;

import java.util.Scanner;

public class IntArrayandCharArray {
	public static void main(String[] args) {
		System.out.print("������Ҫ�������������");
		Scanner input = new Scanner(System.in);
		int[] array;
		array = new int[input.nextInt()];
		System.out.println("Ҫ����" + array.length + "������,�뿪ʼ");
		for (int i = 0; i < array.length; i++) {
			int num = input.nextInt();
			array[i] = num;
		}
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
		// �ַ���������
		System.out.println("������Ҫ������ַ��������");
		int chararray = input.nextInt();
		String[] S = new String[chararray];
		System.out.println("Ҫ����" + chararray + "���ַ����飬�뿪ʼ");
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
