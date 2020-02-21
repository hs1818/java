package chap04;

class Circle4 {
	private double radius;
	
	public Circle4(double r) {
		radius =r;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	double findArea() {
		return 3.14 * getRadius() * getRadius();
	}
	
	void show(double x, double y) {
		System.out.printf("¹ÝÁö¸§ = %.1f, ³ÐÀÌ = %.1f\n", x, y);
	}
}

public class CircleDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle4 myCircle =new Circle4(10.0);
//		System.out.println(myCircle.getRadius());
//		myCircle.setRadius(10.0);
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	}

}
