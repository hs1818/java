package chap07;

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Shape s = new Shape();  //shape클래스는 추상클래스이므로 객체생성x
		//추상클래스는 반드시!! 상속받아서 자식클래스가 상속받은 추상메서드를 오버라이딩하여 메서드를 구현해서 사용해야 함
		Circle c = new Circle(3);
		c.draw();
		System.out.printf("원의 넓이는 %.1f\n", c.findArea());
		
	}

}
