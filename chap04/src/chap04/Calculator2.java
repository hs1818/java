package chap04;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal2 cal2 =new Cal2(10,5);
//		cal2.a =10;
//		cal2.b=5;
		cal2.sum();
		
//		Cal3 cal3 =new Cal3(7);
//		cal3.sub();
		
		Cal3 c1 =new Cal3();
		c1.sum();
		
		Cal3 c2=new Cal3(10);
		c2.sub();
		
		Cal3 c3=new Cal3(10, 5);
		c3.multi();
		
		Cal3 c4 =new Cal3(9.0, 3.0);
		c4.div();
		
	}

}

class Cal2 {
	int a; //int 타입의 변수를 초기화하지 않으면 기본값 0
	int b;
	
	public Cal2(int x, int y) { //생성자로서 자동실행됨
		a =x;
		b= y;
	}
	public void sum() {
		int c = a+b;
		System.out.println("a+b ="+c);
	}
}

class Cal3 {
	private int a;
	private int b;
	
	public Cal3() {
		a =10;
		b=5;
	}
	public Cal3(int x) {
		a =x;
		b= a-(a/2);
	}
	
	public Cal3(int x,int y) {
		a =x;
		b= y;
	}
	
	public Cal3(double x, double y) {
		if(x >0.0 && x < 10.0) {
			a = (int) x;
			b = (int) y;
		}
	}
	
	public void sum() {
		int c =a +b;
		System.out.println("a+b =" +c);
	}
	public void sub() {
		int c =a -b;
		System.out.println("a-b =" +c);
	}
	public void multi() {
		int c =a *b;
		System.out.println("a*b =" +c);
	}
	public void div() {
		int c =a /b;
		System.out.println("a/b =" +c);
	}
}
