package chap07;

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 c1 = new Circle2(5.0);
		Circle2 c2 = new Circle2(6.0);
		
		if(c1.compareTo(c2) > 0) {
			System.out.println("첫번쨰 원이 두번째 원보다 크다");
		}
		else if (c1.compareTo(c2) ==0) {
			System.out.println("두 원의 크기가 같다");
		}
		else {
			System.out.println("첫번째 원이 두번째 원보다 작다");
		}
	}

}

//자바에서 기본으로 지원하는 comparable인터페이스 구현해 객체비교
//인터페이스 comparable의 추상메서드 compareTo를 오버라이딩해 사용
class Circle2 implements Comparable { 
	double radius;
	
	public Circle2(double radius) {
		this.radius = radius;
	}
	
	//object는 자바에서 가장 큰 타입으로 자바의 모든 클래스는 object클래스가 조상임
	//circle2의 객체 c2를 매개변수를 받아 object o에 데이터 저장
	//object o에 데이터가 저장되면 자동타입변환이 발생(object타입으로 받아서)
	
	@Override
	public int compareTo(Object o) {
		Circle2 c = (Circle2) o; //다시 circle2 o를 통해 강제타입변환 실행
		if(this.radius > c.radius) {
			return 1;
		}
		else if(this.radius == c.radius) {
			return 0;
		}
		else {
			return -1;
		}
	}
}
