package chap05;

public class ObjectArgumentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(10.0);
		
		zero(c1);
		System.out.println("원c1의 반지름:" +c1.radius);
		
		zero(c2.radius);
		System.out.println("원c2의 반지름:" +c2.radius);
	}
	public static void zero(Circle c) {
		c.radius =0.0;
	}
	
	public static void zero(double r) {
		r =0.0;
	}

}
class Circle {
	double radius;
	
	public Circle(double radius) {
		this.radius =radius;
	}
	public double getRadius() {
		return radius;
	}
	double findArea() {
		return 3.14*radius*radius;
	}
}