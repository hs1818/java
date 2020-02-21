package chap03;

public class MethodDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 수를 더하고 뺴고 곱하고 나눈 값을 출력하는 메서드 4가지 방식으로 생성
		System.out.println("-------------------1번");
		method1();
		System.out.println("-------------------2번");
		method2(20,5);
		System.out.println("-------------------3번");
		int[] result3 = new int[4];
		result3 = method3();
		System.out.println("변수a+b:" +result3[0]);
		System.out.println("변수a+b:" +result3[1]);
		System.out.println("변수a+b:" +result3[2]);
		System.out.println("변수a+b:" +result3[3]);
		System.out.println("-------------------4번");
		int[] result4 = new int[4];
		result4 = method4(20,5);
		System.out.println("변수a+b:" +result4[0]);
		System.out.println("변수a+b:" +result4[1]);
		System.out.println("변수a+b:" +result4[2]);
		System.out.println("변수a+b:" +result4[3]);
		
	}
	
	//1번방식
	public static void method1() {
		int a =20;
		int b = 5;
		int c =a+b;
		System.out.println("변수 a+b는:"+ c);
		c= a-b;
		System.out.println("변수 a-b는:"+ c);
		c= a*b;
		System.out.println("변수 a*b는:"+ c);
		c= a/b;
		System.out.println("변수 a/b는:"+ c);
	}
	
	//2번방식
	public static void method2(int a, int b) {
		int c =a+b;
		System.out.println("매개변수 a+b는:"+ c);
		c= a-b;
		System.out.println("매개변수 a-b는:"+ c);
		c= a*b;
		System.out.println("매개변수 a*b는:"+ c);
		c= a/b;
		System.out.println("매개변수 a/b는:"+ c);
	}

	//3번방식
	public static int[] method3() {
		int a=20;
		int b=5;
		int[]c= new int[4]; //배열 선언
		c[0] = a+b;
		c[1] = a-b;
		c[2] = a*b;
		c[3] = a/b;
//		c[4 = 100;] //선언된 배열 최대크기를 벗어나서 오류 발생
		return c;
	}

	//4번방식
	public static int[] method4(int a, int b) {
		int[]c = new int[4];
		c[0] = a+b;
		c[1] = a-b;
		c[2] = a*b;
		c[3] = a/b;
		return c;
	}
}
