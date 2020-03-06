package chap07;

abstract public class Wraith extends Unit{ //move부분을 구현하기 싫으면 abstract써줘야함
	public Wraith(String name, int hp) {
		super(name,hp);
	}
	
//	public void fly() {
//		System.out.println(name+"지정한 장소로 이동합니다");
//	}
	
//	중요!)만약 상속받은 추상 메서드를 구현하지 않으면 상속받은 자식클래스도 같이 추상클래스가 됨(class에 abstract써줘야함)
//	public void move() {
//		System.out.println(name+"이 클로킹을 쓰고 지정한 장소로 이동합니다");
//	}
}
