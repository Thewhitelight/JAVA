/**
 * @简单工厂模式
 * @author SZQ
 *
 */
public class SimpleFactory1 {

	public static void main(String[] args) {
		SendFactory1 factory = new SendFactory1();  
        Sender1 sender =factory.produce("sms");  
        sender.Send(); 

	}
}

interface Sender1 {
	public void Send();
}

class MailSender1 implements Sender1 {
	@Override
	public void Send() {
		// TODO Auto-generated method stub
		System.out.println("this is mailsender");
	}
}

 class SmsSender1 implements Sender1 {
	@Override
	public void Send() {
		// TODO Auto-generated method stub
		System.out.println("this is sms sender");
	}
}

class SendFactory1 {
	public Sender1 produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender1();
		} else if ("sms".equals(type)) {
			return new SmsSender1();
		} else {
			System.out.println("请输入正确类型");
			return null;
		}
	}
}