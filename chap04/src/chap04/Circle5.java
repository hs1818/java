package chap04;

public class Circle5 {
	double radius;
	String color;
	
	public Circle5(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public Circle5(double radius) {
		this(radius, "ÆÄ¶û");
	}

	public Circle5(String color) {
		this(10.0, color);
	}
	
	public Circle5() {
		this(10.0, "»¡°­");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
