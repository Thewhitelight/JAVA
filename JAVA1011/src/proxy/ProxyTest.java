/***
 * 代理模式:采用一个代理类调用原方法，对结果产生控制
 */
package proxy;

public class ProxyTest {
	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}
}

interface Sourceable {
	public void method();
}

class Source implements Sourceable {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("this is one");
	}

}

class Proxy implements Sourceable {
	private Source source;

	public Proxy() {
		// TODO Auto-generated method stub

		this.source = new Source();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		source.method();
		System.out.println("Proxy.method()");
		after();
	}

	public void after() {
		// TODO Auto-generated method stub
		System.out.println("this is after method");
	}

	public void before() {
		// TODO Auto-generated method stub\
		System.out.println("this is before method");
	}
}