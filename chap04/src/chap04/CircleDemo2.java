package chap04;

public class CircleDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle();
		myCircle.radius = 10.0;
		myCircle.show(myCircle.radius, myCircle.findArea());
	}

}

class Circle {
	double radius;
	final double PI = 3.14; //상수 선언
	
	double findArea() {
		return PI *radius *radius;
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x,y);
	}
}
