package iostream;

import java.io.IOException;

public class Arrange {
	public static void main(String args[]) throws IOException {
		int[] t = { 1, 2, 3, 4, 5 };
		range(t, 0);
	}

	public static void range(int[] a, int start) {
		if (start == a.length) { // ������
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
		}
		for (int i = start; i < a.length; i++) { // ��ѭ��������startλ���ֵĸ��ֽ��
			int temp = a[start];// startλ��ʱ�����д�startλ�ÿ�ʼ���������������ѡ�񣬴�����ѡһ��������start
			a[start] = a[i];// λ�õ����ֻ�����Ϊʲô��start����ģ���Ϊǰ��Ķ������ˣ�ʣ��û�ù��Ķ�����������
			a[i] = temp;
			range(a, start + 1);// ����start+1λ�����֣��ݹ鿪ʼ
			a[i] = a[start];
			a[start] = temp;
		}

	}

}
