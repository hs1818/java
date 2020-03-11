package chap10;

//제네릭클래스 생성
//number클래스를 제네렉이 상속받아 숫자형만 사용가능하도록 제한해라 (2개의 필드는 숫자를 나타내는 어떤 타입도 될 수 있다)
public class Pair<T extends Number> {
	private T num1; //어떠한 숫자 타입이든 모두 대입이 가능한 제네릭 타입멤버 변수
	private T num2;
	
	public Pair(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public T first() {
		return num1;
	}
	
	public T second() {
		return num2;
	}
}
