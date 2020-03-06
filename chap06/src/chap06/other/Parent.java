package chap06.other;

public class Parent {
	String name ="영조"; //멤버변수는 오버라이딩 안됨 메서드만
	
	public Parent() {
		
	}
	
	void print() {
		System.out.print(name);
	}
}
