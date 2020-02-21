package chap01; //자바 패키지(class보다 큰영역) 설정

//public 외부에서 접근or 실행가능, privacy 접근x
public class Hello { // 자바class 선언, 파일명과 class명이 다를경우 오류발생

	// 프로그램의 시작점, 여러개의 class파일이 존재하더라도 하나의 프로그램에는 하나의 main 메서드(함수)가 존재
	public static void main(String[] args) { // static: class랑 같이 메모리에 등록됨 main:프로그램 실행 시작점
		// TODO Auto-generated method stub
		System.out.println("안녕하세요"); // 콘솔화면에 출력(자바스크립트의 console.log와 같은 기능)
	}

}
