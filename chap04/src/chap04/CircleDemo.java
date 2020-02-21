package chap04;

public class CircleDemo {
	static double radius; //클래스 멤버변수
	static double findArea() {
		//멤버변수 radius사용 시 동일한 클래스 내에서 사용하므로 객체명 붙이지 않고 바로 사용
		return 3.14 *radius * radius; 
	}
	
	static void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 =%.1f\n", x,y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		radius = 10.0;
		double area = findArea();
		show(radius, area);
		
		TestClass ts= new TestClass();
		ts.test();
	}
}

class TestClass{
	 int xx= 100;
	 int yy =200;
	 
	//this: 객체 자기 자신을 뜻하는 키워드
		// 매개변수는 지역변수라 멤버랑 이름 같아도 지역변수가 우선순위, 멤버변수 접근하려면 this사용
	 void test() {
		int xx =1000; //지역변수랑 멤버변수랑 같음
		int yy =2000;
		System.out.println("지역변수xx의 값: " + xx + "\n지역변수 yy의 값: "+ yy);
		System.out.println("클래스멤버 변수xx의 값: " + this.xx + "\n클래스멤버 변수 yy의 값: "+ this.yy);
	}
}
