package chap07;
//extends: 인터페이스, 클래스를 상속받는 키워드(interface끼리 상속가능)
//implements : 인터페이스를 구현할 때 받는 키워드
public class TV implements Controllable{
	//인터페이스를 상속받아 구현한 메서드
	@Override
	public void turnOn() {
		System.out.println("TV를 켠다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끈다");
	}
}

class Computer implements Controllable {
	@Override
	public void turnOn() {
		System.out.println("computer를 켠다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("computer를 끈다");
	}
}
