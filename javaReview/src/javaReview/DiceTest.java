package javaReview;

import java.lang.Math;

public class DiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice d = new Dice();
		System.out.println("�ֻ����� ����: " + d.roll());
	}	
}

//random: 0.0~1.0���� ������ �Ǽ� ��� �޼���
//(int)(Math.random()* 10) + 1;/  1~10���� �������� ���
//(int)(Math.random()* 6)+1; / 1~6���� �������� ���

class Dice {
	public int roll() {
		int result = 0;
		result = (int)(Math.random()* 6)+1;
		return result;
	}
}
