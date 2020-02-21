package chap01;

public class PrintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자바에서 단순이 콘솔에 출력하기
		// println(): 내부 내용 출력 후 라인 변경
		// print(): 내용 내부 출력 후 라인변경x
		// printf(): 내부 내용을 출력 시 지정한 포맷에 맞춰 출력
		System.out.println("화면에 내용을 출력 후 라인 변경");
		System.out.print("화면에 내용을 출력 후 ");
		System.out.print("라인 변경x");

		System.out.println(); // 단순 출력라인 변경
		// printf 사용법
		// System.out.printf("포맷 명시", 데이터1, 데이터2...);
		System.out.printf("화면에 %s 출력 후 %s", "내용을", "라인 변경"); // c언어에서 온 방식(많이 사용x)

		// printf에서 포맷 사용 시 필요한 특수기호(p59)
		// %d: 10진수 숫자
		// %o: 8진수
		// %x: 16진수
		// %c: 문자 1자
		// %5d: 10진수 숫자 5자리, 빈자리 공백처리
		// %-5d: "" 5자리, 왼쪽정렬, 빈자리 공백처리
		// %05d: "" 5자리, 빈자리 0으로 채움
		// %s:문자열 출력
		// %5s:"" 5자리, 빈자리 공백
		// %-5s:"" 5자리 출력, 왼쪽정렬, 빈자리 공백
		// %f: 실수
		// %e: 실수를 지수형식으로
		// %4.1f: 4자리 실수, 소수점 이하 1자리
		// %04.1f: 4자리 "", 소수점 이하 1자리, 빈자리 0
		// %-4.1f: 4자리 "", 소수점 이하 1자리, 왼쪽정렬

	}

}
