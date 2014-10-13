/***
 * 当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
 */
package wrapper;

public class AdapterTest3 {
	public static void main(String[] args) {
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		source1.method1();
		source1.method2();
		source2.method1();
		source2.method2();
	}
}

interface Sourceable {
	public void method1();

	public void method2();
}

abstract class Warpper implements Sourceable {
	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	public void mehtod2() {
		// TODO Auto-generated method stub

	}
}

class SourceSub1 extends Warpper {
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		super.method1();
		System.out.println("the sourceable interface's first Sub1!");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("the sourceable interface's first Sub1!");
	}

}

class SourceSub2 extends Warpper {
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		super.method1();
		System.out.println("the sourceable interface's second Sub2!");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("the sourceable interface's second Sub2!");
	}

}