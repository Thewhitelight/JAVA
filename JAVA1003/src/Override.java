class Cust {
	String name;
	int ID;
	String PWD;
	int money;
	static String bankName = "建设银行";
	int selfNum = 0;
	static int allNum = 0;

	Cust() {
		name = "";
		ID = 0;
		PWD = "";
		money = 0;
		allNum++;
		selfNum = allNum;
	}

	Cust(String newName, int newID, String newPWD, int newMoney) {
		name = newName;
		ID = newID;
		PWD = newPWD;
		money = newMoney;
		allNum++;
		selfNum = allNum;
	}

	public void getMoney(int newMoney) {
		money = money - newMoney;
	}

	public void setMoney(int newMoney) {
		money = money + newMoney;
	}

	public void search() {
		// TODO Auto-generated method stub
		System.out.println("所属银行:" + Cust.bankName);
		System.out.println("您是本银行的" + allNum + "的顾客中的第" + selfNum + "个顾客");
		System.out.println("户名:" + name);
		System.out.println("账号:" + ID);
		System.out.println("账户余额:" + money);
	}

	public void changPWD(String newPWD) {
		// TODO Auto-generated method stub
		PWD = newPWD;
	}

	public void setInfo(String newName, int newID, String newPWD, int newMoney) {
		// TODO Auto-generated method stub
		name = newName;
		ID = newID;
		PWD = newPWD;
		money = newMoney;
	}
}

public class Override {
	public static void main(String[] args) {
		Cust st1 = new Cust("Tom", 100, "11111", 10000);
		Cust st2 = new Cust();
		Cust st3 = new Cust();
		st1.setMoney(5000);
		st1.getMoney(3000);
		st1.changPWD("Tom");
		st1.search();
		st2.setInfo("Jerry", 200, "22222", 10000);
		st2.setMoney(5000);
		st2.getMoney(2000);
		st2.changPWD("Jerry");
		st2.search();
		st3.setInfo("Lee", 300, "22222", 10000);
		st3.setMoney(5000);
		st3.getMoney(2000);
		st3.changPWD("Lee");
		st3.search();
	}
}
