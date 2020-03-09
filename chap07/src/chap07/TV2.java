package chap07;

//interface 다중상속
public class TV2 implements Control1,Control2{
	@Override
	public void powerOn() {
		System.out.println("tv의전원을 킨다");
	}
	
	@Override //컴파일러가 해당 메서드를 오버라이딩하는지 체크함
	public void powerOff() {
		System.out.println("tv의전원을 끈다");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("볼륨 up");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("볼륨 down");
	}
	
}
//interface 단일상속
class Computer2 implements Control1{
	@Override
	public void powerOn() {
		System.out.println("computer의전원 on");
	}
	
	@Override
	public void powerOff() {
		System.out.println("computer의전원 off");
	}
}


