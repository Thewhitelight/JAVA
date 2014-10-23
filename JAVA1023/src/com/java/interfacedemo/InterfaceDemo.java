/**
 * 如果一个类使用(implement)了某个接口，则必须实现该接口的所有方法
 * 一个接口可以通过extends继承多个接口
 * */
package com.java.interfacedemo;
interface IMotocar{
	void method1();
}
interface ICar extends IMotocar{
	void method2();
}
interface ITruck extends IMotocar{
	void method3();
}
interface IStation_waggon extends ICar,ITruck{
	void method4();
}
class Mycar implements IStation_waggon{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("实现method2()");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("实现method1()");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("实现method3()");
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("实现method4()");
	}
	
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Mycar mycar=new Mycar();
		mycar.method1();
		mycar.method2();
		mycar.method3();
		mycar.method4();
	}
}
