package chap04;

public class CircleDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle3 myCircle = new Circle3();
	//기존방식, circle3클래스 멤버 변수에 직접 접근
	//값을 입력하는 형태라 입력한 값이 정확한지 검증할 수 없음
	//ex) 5.0~9.9값만 받을수 있다고 내부적으로 설정되어 있을 때
	//중요 멤버 변수, 메서드 경우는 외부로 노출하지 않고 getter,setter을 통해 데이터를 입력하고 가져오는 방식 사용
//		myCircle.radius = 10.0;
		myCircle.setRadius(10.0);
//		myCircle.show(myCircle.radius, myCircle.findArea());
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
		
	}

}

class Circle3 {
	//멤버 변수나 메서드에 접근제한자 private 설정 시 외부접근 불가능
	private double radius;
	final double PI = 3.14;
		
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double value) {
		radius = value;
	}
	
	double findArea() {
		return 3.14 * getRadius() * getRadius();
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}

}
