package javaReview;

import java.lang.Math; //�ڹ��� ���а��� Ŭ����

public class Review05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ractangle ra = new Ractangle();
		ra.area1();
		
		Ractangle ra5 = new Ractangle();
		ra5.area2();
		
		MicrowaveOven oven = new MicrowaveOven();
		oven.powerOn();
		 
		Triangle.width = 100; //static����:  ��ü���� ���ص� �ٷ� ���ٰ��� 
		Triangle.height = 200;
		Triangle.area();
		
		Triangle tri =new Triangle(); //��ü ���� 
//		tri.width =10;
//		tri.height =20;
//		tri.area();
//		
		tri.width2 =100;
		tri.height2 = 200;
		tri.area1();
		tri.area(); // ������ ����  ���ü� ���� �������� static�� ����� �޸𸮻� �����Ǿ ��밡��
		            //Ŭ���� triangle�� ���� ������ ����(��ü�ȸ��� ����)
		
		int rnd = (int)(Math.random() *10); 
		
		
	}

}

