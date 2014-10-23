/**
 * 一个对象通过引用子类的实例来调用子类的方法就称之为向上转型，子类也会调用父类相同的方法
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
