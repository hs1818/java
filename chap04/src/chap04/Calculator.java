package chap04;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal mix =new Cal();
		mix.a =10;
		mix.b =5;
		
		mix.sum();
		mix.sub();
		mix.multi();
		mix.div();
	}

}

class Cal {
	int a; //멤버변수(클래스 멤버 변수)
	int b;
	
	void sum() {
		int c =a+b;
		System.out.println(a+ "+" + b + "=" +c);
	}
	void sub() {
		int c =a-b;
		System.out.println(a+ "-" + b + "=" +c);
	}
	void multi() {
		int c =a*b;
		System.out.println(a+ "*" + b + "=" +c);
	}
	void div() {
		int c =a/b;
		System.out.println(a+ "/" + b + "=" +c);
	}	
}