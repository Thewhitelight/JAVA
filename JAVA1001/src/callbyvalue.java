public class callbyvalue {
	static int a = 5;

	public static void main(String[] args) {
		t();
	}

	private static void t() {
		// TODO Auto-generated method stub
		int x = f(a);
		System.out.println(a + x);
	}

	private static int f(int r) {
		// TODO Auto-generated method stub
		a = r + 1;
		r = r * 2;
		return r;

	}
}
