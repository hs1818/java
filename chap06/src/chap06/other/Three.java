package chap06.other;

import chap06.One;

public class Three {
	void print() {
		One o =new One();
//		System.out.println(o.secret); 
//		System.out.println(o.roommate);
//		System.out.println(o.child); //외부클래스에서 사용x
		System.out.println(o.anybody);
	}
}
