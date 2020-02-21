package chap01;

public class NumberTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자형 데이터 타입 선언, 자바에서는 변수 선언 시 해당 데이터 타입을 기입해야 함
		// 숫자형 데이터 타입의 기본인 int를 주로 사용, 32비트 cpu를 사용하면서부터 int형 크기를 32비트로 선언함
		// 현재 64비트 cpu가 주력이 되었지만 아직도 int형은 32비트로 선언되어 있음
		int mach;
		int distance;

		mach = 340; // 변수에 데이터 저장
		distance = mach * 60 * 60; // 변수에 연산한 값을 저장
		System.out.println("소리가 1시간 동안 가는거리:" + distance + "m");

		double radius; // 숫자형 변수(실수)를 메모리에 선언, double이 실수 숫자 기본
		double area;

		// 실수 숫자 자료형 사용 시 데이터 끝에 d를 붙이지 않아도 상관없음(기본형이기 때문)
		// float은 반드시 데이터 끝에 f를 붙여야 함
		// float사용 이유는 메모리 적게 들어감
		radius = 10.0;
		area = radius * radius * 3.14;
		System.out.println("반지름이" + radius + "인 원의 넓이" + area);

	}

}
