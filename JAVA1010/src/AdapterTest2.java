/***
 * 将Adapter类作修改，这次不继承Source类，而是持有Source类的实例
 * 
 * @author SZQ
 *
 */
public class AdapterTest2 {
	public static void main(String[] args) {
		Source2 source = new Source2();
		Targetable2 target = new Wrapper(source);
		target.method1();
		target.method2();
	}
}

class Source2 {

	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("this is original method!");
	}

}

interface Targetable2 {
	public void method1();

	public void method2();
}

/*
 * class Adapter2 extends Source2 implements Targetable2 {
 * 
 * @Override public void method2() { // TODO Auto-generated method stub
 * System.out.println("this is the targetable method!"); } }
 */

class Wrapper implements Targetable2 {
	private Source2 source;

	public Wrapper(Source2 source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method!");
	}

}