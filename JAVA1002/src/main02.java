import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main02 {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir;
		BufferedReader br;
		ir = new InputStreamReader(System.in);
		br = new BufferedReader(ir);
		String s = br.readLine();
		s.trim();
		System.out.println(s);
		/*
		 * Scanner input=new Scanner(System.in); int ch=input.nextInt() ;
		 */
		int ch;
		ch = Integer.parseInt(s);
		ch = ch / 10;
		switch (ch) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}
}
