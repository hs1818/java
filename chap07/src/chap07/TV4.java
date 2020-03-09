package chap07;

public class TV4 implements Controllable2 {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv off");
	}

}

class Computer4 implements Controllable2 {
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("com on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("com off");
	}
}
