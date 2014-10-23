/**
 * 向下转型，父类将对象转化为子类对象时，必须使用强制类型转换  (子类名)父类对象。
 * */
package com.java.downwardtransition;
class A{
	public void aMethod() {
		// TODO Auto-generated method stub
		System.out.println("A method");
	}
}
class B extends A{
	public void bMethod1() {
		// TODO Auto-generated method stub
		System.out.println("B method1");
	}
	public void bMethod2() {
		// TODO Auto-generated method stub
		System.out.println("B method2");
	}
}
public class DownwardTransition {
	public static void main(String[] args) {
		A a1=new B();//向上转型
		a1.aMethod();//调用父类方法aMethod()
		B b1=(B)a1;//向下转型，编译无错误，运行时无错误
		b1.aMethod();//调用父类A方法
		b1.bMethod1();//调用B类方法
		b1.bMethod2();//调用B类方法
		//B b2=new B();
		/*A a2=new A();
		B b2=(B)a2;//向下转型，编译无错误，运行时出错
		b2.aMethod();
		b2.bMethod1();
		b2.bMethod2();*/
	}
}
