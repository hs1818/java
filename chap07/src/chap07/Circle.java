package chap07;

//추상클래스를 사용하는 이유는 부모클래스를 상속받아 사용할 자식클래스들이 공통적으로 사용해야 하는 부분을 강제(고정)하기 위해

public class Circle extends Shape{ 
	int radius;
	
	public Circle(int radius) {
		this.radius =radius;
	}
	
	public void draw() {
		System.out.println("원을 그리다");
	}
	
	public double findArea() {
		return pi * radius * radius;
	}
}
