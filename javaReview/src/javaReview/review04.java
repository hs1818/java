package javaReview;

public class review04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ŭ����: ������ ���α׷� ���赵
		Cal ca = new Cal();
		System.out.println(ca.sum(10, 10));
		ca.min(10, 10);
		System.out.println(ca.min(10, 10));
		ca.x(10, 10);
		System.out.println(ca.x(10, 10));
		ca.div(10, 10);
		System.out.println(ca.div(10, 10));
		
		Television tv = new Television("702ȣ");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeUp();
		tv.channelUp();
		tv.channelUp();
		tv.powerOff();
		
		Television tv1= new Television("703ȣ");
		tv1.powerOn();
		tv1.powerOff();
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.powerOff();
		
		Phone ph = new Phone("��1");
		ph.turnOn();
		ph.call();
		ph.callOff();
		ph.turnOff();
		
		Phone ph1 = new Phone("��2");
		ph1.turnOn();
		ph1.call();
		ph1.callOff();
		ph1.turnOff();
		
		
		
	}

}

class Cal {
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int min(int a, int b) {
		return a-b;
	}
	public static int x(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
	}
}
