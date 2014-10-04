package iostream;

public class Recursive {

	public static void main(String[] args) {
		System.out.println(Fib(4));
		System.out.println(Fst(4));
		char a = 'a', b = 'b', c = 'c';
		Hanoi(3, a, b, c);
		System.out.println(Factorial(5));
	}

	public static int Fib(int n) {// Fibonacii���еݹ�
		// TODO Auto-generated method stub
		if (n == 1 || n == 2) {
			return 1;
		}
		return Fib(n - 1) + Fib(n - 2);
	}

	private static int Fst(int m) {// Fstairs ��̨������ݹ�
		// TODO Auto-generated method stub
		if (m == 1 || m == 2) {
			return m;
		}
		return Fst(m - 1) + Fst(m - 2);
	}

	public static void Hanoi(int n, char a, char b, char c) {
		// TODO Auto-generated method stub
		if (n == 1) {
			System.out.println("��" + a + "Ų��" + c);
		} else {
			Hanoi(n - 1, a, c, b);
			System.out.println("��" + a + "Ų��" + c);
			Hanoi(n - 1, b, a, c);
		}
	}

	private static int Factorial(int n) {// �׳˵ݹ�
		// TODO Auto-generated method stub
		if (n == 0) {
			return 1;
		}
		if (n > 0) {
			return n * Factorial(n - 1);
		}
		return n;

	}
}
