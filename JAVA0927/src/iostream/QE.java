package iostream;

import java.util.Scanner;

public class QE {
	private static void qe(int a,int b,int c) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		input.close();
		if (a==0) {
			System.out.println("输入数据出错");
		}
		else {
			double x1,x2;
			double x=b*b-4*a*c;
			if (x>=0) {
				x1=((-b)+Math.sqrt(x))/(2.0*a);
				x2=((-b)-Math.sqrt(x))/(2.0*a);
				if (x2>x1) {
					double temp=x1;
					x1=x2;
					x2=temp;
				}
				System.out.println(x1);
				System.out.println(x2);
			}
			else {
				System.out.println("输入数据出错");
			}
		}
		
	}
	public static void main(String[] args) {
		int a=0,b=0,c=0;
		qe(a, b, c);
	}
}
