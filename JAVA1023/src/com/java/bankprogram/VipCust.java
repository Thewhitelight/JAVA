package com.java.bankprogram;

public class VipCust extends Cust {

	public VipCust(String name, int ID, int money, String PWD) {
		super(name, ID, money, PWD);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getMoney() {
		// TODO Auto-generated method stub
		System.out.println("������ȡ����");
		int m = Integer.parseInt(KB.scan());
		if (m - 3000 >= money) {
			System.out.println("����͸֧����3000Ԫ");
		} else
			money -= m;
	}

	@Override
	public boolean getMoney(int m) {
		// TODO Auto-generated method stub
		if (m - 3000 >= m) {
			System.out.println("͸֧���ܳ���3000Ԫ");
			return false;
		} else {
			money -= m;
			return true;
		}
	}

	void zhuanzhang(Cust st[]) {
		// TODO Auto-generated method stub
		System.out.println("������Ҫת����˺�");
		int m = Integer.parseInt(KB.scan());
		for (int i = 0; i < st.length; i++) {
			if (m == st[i].ID) {
				System.out.println("������ת�˽��");
				int n = Integer.parseInt(KB.scan());
				if (n > 0) {
					if (this.getMoney(n)) {
						st[i].saveMoney(n);
					}
				} else {
					if (st[i].checkPWD() == true) {
						if (st[i].getMoney(-n)) {
							this.saveMoney(-n);
						}
					} else {
						System.out.println("������󣬲���ת��");
					}
				}
				return;
			}
		}
		System.out.println("û�д˹˿�");
	}

	@Override
	public void run(Cust[] st) {
		// TODO Auto-generated method stub
		if (checkPWD() == false) {
			System.out.println("�������3�Σ���ӭ�´ι���");
			return;
		}
		boolean flag = true;
		while (flag) {
			System.out.println("***************");
			System.out.println("ȡ���밴\t1");
			System.out.println("����밴\t2");
			System.out.println("��ѯ�밴\t3");
			System.out.println("�����밴\t4");
			System.out.println("ת���밴\t5");
			System.out.println("�˳��밴\t6");
			System.out.println("***************");
			int cmd = Integer.parseInt(KB.scan());
			switch (cmd) {
			case 1:
				getMoney();
				break;
			case 2:
				saveMoney();
				break;
			case 3:
				search();
				break;
			case 4:
				changePWD();
				break;
			case 5:
				zhuanzhang(st);
				break;
			case 6:
				flag = false;
				break;
			}
		}
	}
}
