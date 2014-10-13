/***
 * ��һ��Source�࣬ӵ��һ�������������䣬Ŀ��ӿ���Targetable��ͨ��Adapter�࣬��Source�Ĺ�����չ��Targetable��
 * Adapter��̳�Source�࣬ʵ��Targetable�ӿ�
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
