/**
 * ����ת�ͣ����ཫ����ת��Ϊ�������ʱ������ʹ��ǿ������ת��  (������)�������
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
		A a1=new B();//����ת��
		a1.aMethod();//���ø��෽��aMethod()
		B b1=(B)a1;//����ת�ͣ������޴�������ʱ�޴���
		b1.aMethod();//���ø���A����
		b1.bMethod1();//����B�෽��
		b1.bMethod2();//����B�෽��
		//B b2=new B();
		/*A a2=new A();
		B b2=(B)a2;//����ת�ͣ������޴�������ʱ����
		b2.aMethod();
		b2.bMethod1();
		b2.bMethod2();*/
	}
}
