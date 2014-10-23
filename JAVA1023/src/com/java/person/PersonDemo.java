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
		System.out.println("���ѧ����Ϣ����ѯ����ѧ���ɼ���");
	}
	
}
class Students extends Person{

	@Override
	void proScore() {
		// TODO Auto-generated method stub
		System.out.println("��ѯ�Լ��ĳɼ���");
	}
	
}
class Teacher extends Person{

	@Override
	void proScore() {
		// TODO Auto-generated method stub
		System.out.println("������ɼ�����ӡ�ɼ���");
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