package chap01;

public class Hello4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hello = "안녕";
		System.out.println(hello);
	}
// 식별자: 프로그램에서 사용하는 변수, 메서드, 클래스, 상수 등을 구별하기 위한 것
// 규칙
	// 1. 문자, _, $로 시작
	// 2. 영문 대문자, 소문자로 구분
	// 3. +,- 연산자 포함x
	// 4. 자바 키워드(예약어)사용 x
	// 5. 길이 제한x

// 변수 및 메서드 명명법
	// 1. 변수와 메서드는 모두 소문자로 표기
	// 2. 복합 단어일 경우 2번째 단어부터 단어의 첫글자만 대문자
	/*
	 * int thisYear; String currentPosition; boolean isEmpty; public int getYear() {
	 * }
	 */
	// 3. 클래스와 인터페이스는 첫글자만 대문자로 표기
	// 4. 복합단어일 경우 모두 첫글자만 대문자로 표기
	/*
	 * public interface MyRunnable {}
	 */
	// 5. 상수는 모두 대문자로 표기
	// 6. 복합 단어일 경우 언더바를 사용
	/*
	 * final int NUMBER_ONE =1; final double PI =3.14;
	 */

//	변수: 데이터를 저장하기 위한 메모리 공간
//	데이터 타입
	// 기본 타입: 자바언어에서 기본적으로 지원하는 데이터 타입, 정수, 실수, 문자, 문자열, 논리형 등과 같은 타입, 실제 값을 저장하기 위한
	// 타입
	// 참조 타입: 데이터를 가지고 있는 주소를 저장하기 위한 타입, 배열, 열거형, 클래스, 인터페이스

	// 정수: 숫자를 저장하기 위한 데이터 타입-byte,short,int(기본),long
	// 실수: 소수점이 있는 숫자 데이터를 저장하기 위한 데이터 타입- float, double(기본)
	// 문자: 문자를 표현하기 위한 데이터 타입 -한글자씩 표현
	// 논리형: 참과 거짓을 표현하기 위한 데이터 타입 -true, false

}
