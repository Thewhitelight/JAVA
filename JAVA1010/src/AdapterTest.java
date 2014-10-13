/***
 * 有一个Source类，拥有一个方法，待适配，目标接口是Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 * Adapter类继承Source类，实现Targetable接口
 * 
 * @author SZQ
 *
 */
public class AdapterTest {
	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
		/*
		 * Source source=new Source(); source.method1();
		 */
	}
}

class Source {
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("this is original method!");
	}
}

interface Targetable {
	public void method1();

	public void method2();
}

class Adapter extends Source implements Targetable {
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method!");
	}
}
