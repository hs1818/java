package javaReview;

import java.lang.Math; //자바의 수학관련 클래스

public class Review05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ractangle ra = new Ractangle();
		ra.area1();
		
		Ractangle ra5 = new Ractangle();
		ra5.area2();
		
		MicrowaveOven oven = new MicrowaveOven();
		oven.powerOn();
		 
		Triangle.width = 100; //static장점:  객체생성 안해도 바로 접근가능 
		Triangle.height = 200;
		Triangle.area();
		
		Triangle tri =new Triangle(); //객체 생성 
//		tri.width =10;
//		tri.height =20;
//		tri.area();
//		
		tri.width2 =100;
		tri.height2 = 200;
		tri.area1();
		tri.area(); // 원래는 값이  나올수 없는 구조지만 static을 사용해 메모리상에 공유되어서 사용가능
		            //클래스 triangle이 값을 가지고 있음(객체안만들어도 공유)
		
		int rnd = (int)(Math.random() *10); 
		
		
	}

}

