package chap04;

public class Circle5 {
	double radius;
	String color;
	
	//사용자가 만든 기본 생성자
	public Circle5() {
		this(10.0, "빨강"); 
	}
	
	public Circle5(String color) { 
		this(10.0, color); 
	}
	
	public Circle5(double radius) {
		this(radius, "파랑");
	}
	
	public Circle5(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public void show() {
		System.out.println("radius: "+radius + "\ncolor:"+color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle5 c1 = new Circle5();
		c1.show();
		
		Circle5 c2 = new Circle5("노랑");
		c2.show();
		
		Circle5 c3 = new Circle5(9.0);
		c3.show();
	}

}
