/**
 * @多个静态方法简单工厂模式
 * @author SZQ
 *
 */
public class SimpleFactory3 {

	public static void main(String[] args) {
		Sender3 sender=SendFactory3.produceMail();
		sender.Send();
	}
}

interface Sender3 {
	public void Send();
}

class MailSender3 implements Sender3 {
	@Override
	public void Send() {
		// TODO Auto-generated method stub
		System.out.println("this is mailsender");
	}
}

 class SmsSender3 implements Sender3 {
	@Override
	public void Send() {
		// TODO Auto-generated method stub
		System.out.println("this is sms sender");
	}
}

class SendFactory3 {
	public static Sender3 produceMail(){
		return new MailSender3();
	}
	public static Sender3 produceSms(){
		return new SmsSender3();
	}
}