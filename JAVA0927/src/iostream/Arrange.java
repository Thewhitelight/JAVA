package iostream;

import java.io.IOException;

public class Arrange {
	public static void main(String args[]) throws IOException {
		int[] t = { 1, 2, 3, 4, 5 };
		range(t, 0);
	}

	public static void range(int[] a, int start) {
		if (start == a.length) { // 输出结果
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
		}
		for (int i = start; i < a.length; i++) { // 用循环来做第start位数字的各种结果
			int temp = a[start];// start位置时，还有从start位置开始到数组结束总数种选择，从其中选一个数来与start
			a[start] = a[i];// 位置的数字互换，为什么用start后面的，因为前面的都决定了，剩下没用过的都被换到后面
			a[i] = temp;
			range(a, start + 1);// 决定start+1位置数字，递归开始
			a[i] = a[start];
			a[start] = temp;
		}

	}

}
