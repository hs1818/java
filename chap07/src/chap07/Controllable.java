package chap07;

//인터페이스 선언, 멤버변수 못씀, 기본적으로 추상 메서드만 가지고 있음
//다중상속을 지원함
//상속받을 추상메서드를 반드시 사용하도록 강제함(turnon이랑 turnoff)
public interface Controllable { 
	void turnOn(); //추상메서드
	void turnOff();
}
