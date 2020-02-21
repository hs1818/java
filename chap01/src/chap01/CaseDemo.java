package chap01;

public class CaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 타입 변환: 서로 다른 데이터 타입을 연산하기 위해서 동일한 데이터 타입으로 데이터 타입을 변환하는 것
		// byte -> int
		// float -> double
		// int => double

		// 자동타입 변환: 서로 다른 데이터 타입을 연산 시 더 큰 데이터 타입으로 자동으로 변환하여 연산을 진행하는 것
//		double d1 = 5 * 3.14; // int타입 5와 double타입 3.14를 연산하면 자동 타입변환이 발생하여 5.0 * 3.14 로 연산됨
//								// 더 큰 데이터 타입인 실수로 변환됨
//		double d2 = 1; // int타입 1을 double형 변수 d3에 저장 시 자동타입 변환으로 실수1.0으로 저장
//		// 강제타입 변환: 서로 다른 데이터 타입을 연산 시 특정한 데이터 타입으로 사용자가 직접 데이터 타입 변환하는 것
//		// 사용법
//		// (변환할 데이터 타입) 데이터값;
//		float f = (float) 3.14; // float형 변수 f에 double형 데이터값 3.14를 저장할 수 없어서 강제로 float형으로 변환 후 저장
//		byte b = (byte) 300; // int300을 byte b에 저장불가 하므로 byte로 변환 후 저장
//		byte x = (byte) 3.14;
//		double d = (double) 3.14; // double형 변수 d에 float형 데이터 값을 double형으로 변환해 저장

		byte by = 100;
		System.out.println("byte타입 변수 by의 값:" + by);
		int inta = by; // 자동 타입 변환
		System.out.println("int타입 변수 inta의 값:" + inta);

		inta = 130;
		System.out.println("inta타입 변수 inta의 값:" + inta);
		by = (byte) 130; // 강제 타입 변환
		System.out.println("byte타입 변수 by의 값:" + by);

		System.out.println("---------------------");

		int intb = 100;
		System.out.println("inta타입 변수 intb의 값:" + intb);
		double dbb = intb; // 자동 타입 변환
		System.out.println("double 타입 dbb의 값:" + dbb);
		intb = (int) dbb; // 오류발생해서 강제 타입 변환
		System.out.println("inta타입 변수 intb의 값:" + intb);
		intb = (int) 3.14; // 강제 타입 변환
		System.out.println("inta타입 변수 intb의 값:" + intb);

		System.out.println("---------------------");
		int i;
		double d;
		byte b;

		i = 7 / 4; // 정수 연산= 소수점 자리 저장x
		System.out.println(i);
		d = 7 / 4; // 정수끼리 연산이므로 결과가 1, double타입 변수에 저장되어 자동타입 변환 1.0
		System.out.println(d);
		// int타입과 double타입의 연산으로 int타입이 자동타입 변환이 실행되어 double타입의 값 7.0/double 4.0 = 1.75
		d = 7 / (double) 4;
		System.out.println(d);

		i = 300; // int 타입변수 i에 값 300저장, 300은 byte타입의 최소값 -128과 최대값 127사이있지않으므로 byte형으로 변환불가
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			System.out.println("byte타입으로 변환할 수 없습니다");
		} else {
			b = (byte) i;
		}

	}

}
