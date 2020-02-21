package chap03;

public class MethodDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//메서드 오버로딩: 하나의 클래스에 동일한 이름의 메서드가 여러개 존재
			//하지만 오버로딩의 조건은 매개변수의 개수, 데이터 타입, 반환 타입이 서로 달라야함
		int i1=3;
		int i2=7;
		int i3=10;
		
		double d1 =7.0;
		double d2 =3.0;
		
		System.out.printf("max(%d,%d) = %d\n", i1,i2, max(i1, i2));
		System.out.printf("max(%.1f,%.1f) = %.1f\n", d1,d2, max(d1, d2));
		System.out.printf("max(%d,%d,%d) = %d\n", i1,i2,i3, max(i1, i2,i3));
		
		int x =10;
		int y =20;
		int z =30;
		
		sum();
		sum(x);
		sum(x,y);
		sum(x,y,z);
	}
	public static int max(int n1, int n2) {
		int result =n2;
		if(n1>n2) {
			result = n1;
		}
		return result;
	}
	
	public static double max(double n1, double n2) {
		double result =n2;
		if(n1>n2) {
			result = n1;
		}
		return result;
	}
	
	public static int max(int n1, int n2, int n3) {
		return max(max(n1,n2),n3);
		
//		int result =max(n1, n2); //위에꺼 풀어서 쓴것
//		result = max(result,n3);
//		return result;
	}
	
	public static void sum() {
		System.out.println("매개변수없는 sum함수");
	}
	public static void sum(int x) {
		System.out.println("매개변수 1개 sum함수");
	}
	public static void sum(int x, int y) {
		System.out.println("매개변수2개 sum함수");
	}
	public static void sum(int x, int y, int z) {
		System.out.println("매개변수3개 sum함수");
	}
	
	

}
