/**
 * һ������ͨ�����������ʵ������������ķ����ͳ�֮Ϊ����ת�ͣ�����Ҳ����ø�����ͬ�ķ���
 * */
package com.java.uptransition;
class Mammal{
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("mammal speak");
	}
}
class Dog extends Mammal{
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		super.speak();
		System.out.println("wangwang");
	}
}
class Cat extends Mammal{
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		super.speak();
		System.out.println("miaomiao");
	}
}
public class UpTransition {
	public static void main(String[] args) {
		Mammal m=new Mammal();
		m.speak();
		m=new Dog();
		m.speak();
		m=new Cat();
		m.speak();
	}
}
