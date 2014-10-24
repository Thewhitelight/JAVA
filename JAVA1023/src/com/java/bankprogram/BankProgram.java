/**
 * 改进的银行账户管理系统
 * */
package com.java.bankprogram;

public class BankProgram {
	public static void main(String[] args) {
		Cust st[] = new Cust[8];
		st[0] = new Cust("Tom", 111, 1000, "111");
		st[1] = new Cust("Jerry", 222, 2000, "222");
		st[2] = new Cust("Marry", 333, 3000, "333");
		st[3] = new Cust("Linda", 444, 4000, "444");
		st[4] = new Cust("Tom", 555, 5000, "555");
		st[5] = new Cust("Jerry", 666, 6000, "666");
		st[6] = new Cust("Marry", 777, 7000, "777");
		st[7] = new Cust("Linda", 888, 8000, "888");
		while (true) {
			System.out.println("请输入账号");
			int id = Integer.parseInt(KB.scan());
			for (int i = 0; i < st.length; i++) {
				if (id == st[i].getID()) {
					st[i].run(st);
					break;
				}
			}
			System.out.println("是否还有用户，N：退出系统");
			String str = KB.scan();
			if (str.equals("N") || str.equals("n")) {
				break;
			}
		}
	}
}
