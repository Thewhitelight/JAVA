
public class Object {
	public static void main(String[] args) {
		Cust mycust=new Cust("Tom", 100, "11111", 10000);
		mycust.setMoney(5000);
		mycust.getMoney(3000);
		mycust.changPWD("Tom");
		mycust.search();
	}
}
class Cust1{
	String name;
	int ID;
	String PWD;
	int money;
	Cust1(String newName,int newID,String newPWD,int newMoney){
		name=newName;
		ID=newID;
		PWD=newPWD;
		money=newMoney;
	}
	public void getMoney(int newMoney) {
		money=money-newMoney;
	}
	public void setMoney(int newMoney) {
		money=money+newMoney;
	}
	 void search() {
		// TODO Auto-generated method stub
		System.out.println("����"+name);
		System.out.println("�˺�"+ID);
		System.out.println("�˻����"+money);
		System.out.println("����"+PWD);
	}
	 void changePWD(String newPWD) {
		// TODO Auto-generated method stub
		PWD=newPWD;
	}
}