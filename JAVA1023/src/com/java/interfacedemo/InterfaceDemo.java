/**
 * ���һ����ʹ��(implement)��ĳ���ӿڣ������ʵ�ָýӿڵ����з���
 * һ���ӿڿ���ͨ��extends�̳ж���ӿ�
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
		System.out.println("ʵ��method2()");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("ʵ��method1()");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("ʵ��method3()");
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("ʵ��method4()");
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
