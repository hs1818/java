package chap06.other;

import chap06.One; //외부패키지에서 로드해서 사용

public class One2 extends One{
	void print() {
//		System.out.println(secret); 
//		System.out.println(roommate); //default 동일 패키지 접근가능, 외부x
		System.out.println(child); //protected 다른 패키지의  자식클래스 접근가능
		System.out.println(anybody);
	}
}
