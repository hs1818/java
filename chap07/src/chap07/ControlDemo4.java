package chap07;

public class ControlDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV4 tv = new TV4();
		Computer4 com = new Computer4();
		
		tv.turnOn(); //remotecontrollable구현
		tv.turnOff();//remotecontrollable구현
		tv.repair(); //controllable2 디폴트 메서드 상속받아 구현/오버라이딩 가능/인터페이스지만 메서드 사용가능(default메서드라)
					//static이 아니라서 (인터페이스명.메서드명) 접근불가(반드시 상속받아 사용) 
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable2.reset(); //static이라 (인터페이스명.메서드명)
		
		//tv.reset();  reset은 정적메서드라 (인터페이스명.메서드명)로 접근가능
		//com.reset();
		//Controllable2.repair(); repair은 디폴트메서드라 상속을 통해서만 실행이 가능
		
		//인터페이스는 멤버접근자를 private로 사용x
	}

}
