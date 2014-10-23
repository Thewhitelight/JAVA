package com.java.person;
abstract class Person{
	private int ID;
	private String username;
	private String password;
	abstract void proScore();
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
class Manager extends Person{

	@Override
	void proScore() {
		// TODO Auto-generated method stub
		System.out.println("添加学生信息、查询所有学生成绩。");
	}
	
}
class Students extends Person{

	@Override
	void proScore() {
		// TODO Auto-generated method stub
		System.out.println("查询自己的成绩。");
	}
	
}
class Teacher extends Person{

	@Override
	void proScore() {
		// TODO Auto-generated method stub
		System.out.println("请输入成绩、打印成绩。");
	}
	
}
public class PersonDemo {
	public static void main(String[] args) {
		Manager m=new Manager();
		Students s=new Students();
		Teacher t=new Teacher();
		m.proScore();
		s.proScore();
		t.proScore();
	}
}