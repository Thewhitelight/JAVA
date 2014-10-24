import java.util.Scanner;

public class main03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.close();
		int a = 0;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			a = input.nextInt();
			sum = sum + a;
			a = a / 10;
			switch (a) {
			case 9:
				System.out.println("A");
				continue;
			case 8:
				System.out.println("B");
				continue;
			case 7:
				System.out.println("C");
				continue;
			case 6:
				System.out.println("D");
				continue;
			default:
				System.out.println("F");
				continue;
			}
		}
		System.out.println(sum);
	}
}
