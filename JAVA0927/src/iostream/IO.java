package iostream;

import java.io.IOException;
import java.util.Scanner;

public class IO {
	public static void main(String[] args) throws IOException {
		try {
			int a = 0, i = 0;
			Scanner input = new Scanner(System.in);
			System.out.println("������������:");
			a = input.nextInt();
			System.out.println(a);
			String s = null;
			System.out.println("�����ַ���");
			s = input.next();
			System.out.println(s);
			i = input.nextInt();
			input.close();
			for (int j = 0; j < i; j++) {
				System.out.println(i);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ݴ���");
		}
		double a=0;
		a=3/2.0;
		System.out.println(a);
	}

}
