package javaReview;

import java.lang.Math;

public class DiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice d = new Dice();
		System.out.println("주사위의 숫자: " + d.roll());
	}	
}

//random: 0.0~1.0까지 임의의 실수 출력 메서드
//(int)(Math.random()* 10) + 1;/  1~10까지 랜덤숫자 출력
//(int)(Math.random()* 6)+1; / 1~6까지 랜덤숫자 출력

class Dice {
	public int roll() {
		int result = 0;
		result = (int)(Math.random()* 6)+1;
		return result;
	}
}
