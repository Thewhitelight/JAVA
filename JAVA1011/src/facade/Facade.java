/***
 * 门面模式 提供统一接口去访问多个子系统的不同接口
 */
package facade;

public class Facade {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.start();
		computer.end();
		String n=new String();
		n="dfsgsdf";
		System.out.println(n);
	}
}

class Cpu {
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Cpu.start()");
	}

	public void end() {
		System.out.println("Cpu.end()");
	}
}

class Menoy {
	public void start() {
		System.out.println("Menoy.start()");
	}

	public void end() {
		System.out.println("Menoy.end()");
	}
}

class Computer {
	private Cpu cpu;
	private Menoy menoy;

	public Computer() {
		// TODO Auto-generated constructor stub
		cpu = new Cpu();
		menoy = new Menoy();
	}

	public void start() {
		// TODO Auto-generated method stub
		cpu.start();
		menoy.start();
	}

	public void end() {
		// TODO Auto-generated method stub
		cpu.end();
		menoy.end();
	}
}
