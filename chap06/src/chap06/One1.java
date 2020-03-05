package chap06;

public class One1 extends One{
	void print() {
//		System.out.println(secret); //private 접근x
		System.out.println(roommate); //default 상속가능
		System.out.println(child); //protected 자식클래스 접근 가능
		System.out.println(anybody); //public 접근가능
		
//		void show() {
//			
//		}
	}
}
