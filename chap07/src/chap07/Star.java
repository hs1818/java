package chap07;

public class Star {
	
	public static void main(String[] args) {
		Marine m = new Marine("마린", 100);
		m.move();
//		m.run();
		m.stop();
		m.attack();
		
		Tank t = new Tank("탱크", 300);
		t.move();
//		t.drive();
		t.stop();
		t.attack();
		
//		Wraith w = new Wraith("레이스", 250); //move안쓰면 추상클래스 되서 객체생성안됨(wraith를 다른애가 상속받아서 move써야함)
//		w.move();
////		w.fly();
//		w.stop();
//		w.attack();
	}
}
