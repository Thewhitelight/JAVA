/**
 * @多个方法的简单工厂模式
 * @author SZQ
 *
 */
public class SimpleFactory2 {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produceMail();
		sender.Send();

	}
}

interface Sender {
	public void Send();
}

class MailSender implements Sender {
	@Override
	public void Send() {
		// TODO Auto-generated method stub
		System.out.println("this is mailsender");
	}
}

class SmsSender implements Sender {
	@Override
	public void Send() {
		// TODO Auto-generated method stub
		System.out.println("this is sms sender");
	}
}

class SendFactory {
	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}
}
