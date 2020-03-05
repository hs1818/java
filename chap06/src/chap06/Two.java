package chap06;

public class Two {
	void print() {
		One o =new One(); //동일 패키지내에서 one클래스를 객체로 인스턴스화
//		System.out.println(o.secret);  //private
		System.out.println(o.roommate); //default
		System.out.println(o.child); //protected
		System.out.println(o.anybody); //public
	}
}
