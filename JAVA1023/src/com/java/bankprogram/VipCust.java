package com.java.bankprogram;

public class VipCust extends Cust {

	public VipCust(String name, int ID, int money, String PWD) {
		super(name, ID, money, PWD);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getMoney() {
		// TODO Auto-generated method stub
		System.out.println("请输入取款金额");
		int m = Integer.parseInt(KB.scan());
		if (m - 3000 >= money) {
			System.out.println("不能透支超过3000元");
		} else
			money -= m;
	}

	@Override
	public boolean getMoney(int m) {
		// TODO Auto-generated method stub
		if (m - 3000 >= m) {
			System.out.println("透支不能超过3000元");
			return false;
		} else {
			money -= m;
			return true;
		}
	}

	void zhuanzhang(Cust st[]) {
		// TODO Auto-generated method stub
		System.out.println("请输入要转入的账号");
		int m = Integer.parseInt(KB.scan());
		for (int i = 0; i < st.length; i++) {
			if (m == st[i].ID) {
				System.out.println("请输入转账金额");
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
						System.out.println("密码错误，不能转账");
					}
				}
				return;
			}
		}
		System.out.println("没有此顾客");
	}

	@Override
	public void run(Cust[] st) {
		// TODO Auto-generated method stub
		if (checkPWD() == false) {
			System.out.println("密码错误3次，欢迎下次光临");
			return;
		}
		boolean flag = true;
		while (flag) {
			System.out.println("***************");
			System.out.println("取款请按\t1");
			System.out.println("存款请按\t2");
			System.out.println("查询请按\t3");
			System.out.println("改密请按\t4");
			System.out.println("转账请按\t5");
			System.out.println("退出请按\t6");
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
