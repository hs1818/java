package javaReview;

public class review01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*메서드: 자바스크립트의 함수와 동일한 개념, 어떤 특정한 기능을 수행하기 위한 코드의 모임,
		함수는 혼자서 작동하지만 메서드는 클래스의 멤버로 포함되어 동작 */
		//메서드 오버로딩: 하나의 클래스 내에서 동일한 이름의 메서드를 여러개 사용하는 것
		//오버로딩 기준: 1. 매개변수 개수가 다름 2. 매개변수의 타입이 다름
		sum();
		sum(10, 10);
		sum(10);
		
		min();
		min(10, 10);
		min(10);
		
		x();
		x(10, 10);
		x(10);
		
		
	}
	
	public static void sum() {
		int a =10;
		int b =10;
		int c = a +b; 
		System.out.println("a +b =" + c);
	}
	
	public static void sum(int a, int b) {
		int c = a +b; 
		System.out.println("a +b =" + c);
	}
	public static void sum(double a) {
		double b =10;
		double c = a +b; 
		System.out.println("a +b =" + c);
	}
	
	public static void min() {
		int a =10;
		int b =10;
		int c = a -b; 
		System.out.println("a -b =" + c);
	}
	
	public static void min(int a, int b) {
		int c = a -b; 
		System.out.println("a -b =" + c);
	}
	public static void min(int a) {
		int b =10;
		int c = a -b; 
		System.out.println("a -b =" + c);
	}
	
	public static void x() {
		double a =10;
		double b =10;
		double c = a *b; 
		System.out.println("a -b =" + c);
	}
	
	public static void x(double a, double b) {
		double c = a *b; 
		System.out.println("a -b =" + c);
	}
	public static void x(double a) {
		double b =10;
		double c = a *b; 
		System.out.println("a -b =" + c);
	}
	

}
