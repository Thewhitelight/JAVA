package com.java.bankprogram;

public class Cust {
	String name;
	int ID;
	String PWD;
	int money;
	public Cust(String name,int ID,int money,String PWD) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.ID=ID;
		this.PWD=PWD;
		this.money=money;
	}
	public int getID() {
		return ID;
	}
	public void getMoney() {
		System.out.println("������ȡ����");
		int m=Integer.parseInt(KB.scan());
		if (m>=money) {
			System.out.println("����͸֧");
		}
		else
			money-=m;
	}
	boolean getMoney(int m){
		if (m>=money) {
			System.out.println("����͸֧");
			return false;
		}
		else
			money-=m;
		return true;
	}
	void saveMoney(){
		System.out.println("����������");
		int m=Integer.parseInt(KB.scan());
		this.money+=m;
	}
	void saveMoney(int m){
		this.money+=m;
	}
    void changePWD() {
		// TODO Auto-generated method stub
    	System.out.println("�������µ�����");
    	String p=KB.scan();
    	PWD=p;
	}
    void search() {
		// TODO Auto-generated method stub
    	System.out.println("name="+name);
    	System.out.println("ID="+ID);
    	System.out.println("money="+money);
	}
    boolean checkPWD() {
		// TODO Auto-generated method stub
    	System.out.println("����������");
    	for (int i = 0; i < 3; i++) {
			String p=KB.scan();
			if (p.equals(this.PWD)) {
				return true;
			}
			else{System.out.println("�����������������");}
			
		}
    	return false;
	}
    public void run(Cust st[]) {
		// TODO Auto-generated method stub
    	if (checkPWD()==false) {
			System.out.println("�������3�Σ���ӭ�´ι���");
			return;
		}
    	boolean flag=true;
    	while (flag) {
    		System.out.println("***************");
    		System.out.println("ȡ���밴\t1");
    		System.out.println("����밴\t2");
    		System.out.println("��ѯ�밴\t3");
    		System.out.println("�����밴\t4");
    		System.out.println("�˳��밴\t5");
    		System.out.println("***************");
    		int cmd=Integer.parseInt(KB.scan());
    		switch (cmd) {
			case 1:getMoney();break;
			case 2:saveMoney();break;
			case 3:search();break;
			case 4:changePWD();break;
			case 5:flag=false;break;
			}
		}
	}
}
