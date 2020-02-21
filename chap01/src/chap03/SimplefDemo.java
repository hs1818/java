package chap03;

import java.util.Scanner;

public class SimplefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제어문
			//자바프로그램에서 조건에 따라 프로그램의 흐름을 변경할 수 있음
			//자바스크립트 제어문과 동일함
			//if, if else, else if, switch case
		
		//if: 조건 결과값이 true일때 추가로 코드 실행
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int number = in.nextInt();
		
		if(number % 2 ==0) {
			System.out.println("짝수!");
		}
		if(number %2 ==1) {
			System.out.println("홀수!");
		}
		System.out.println("종료");
		
		System.out.println("--------if else");
		//if else
		//조건에 따라 true false일때 실행코드가 달라짐
		//둘중에 무조건 하나 실행
		System.out.print("숫자를 입력하세요:");
		int number2 = in.nextInt();
		if(number2 %2 ==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		System.out.println("종료");
		
		System.out.println("--------3항 연산자 사용");
		System.out.println(number2 % 2 ==0?"짝수":"홀수");

		System.out.println("--------else if");
		//else if 여러개의 조건 비교
		//마지막 else문 필요없을 시 삭제해도 됨
		String grade ="";
		System.out.print("점수 입력하세요: ");
		
		int score = in.nextInt();
		if(score >=90) {
			grade = "A";
		}
		else if(score >=80) {
			grade = "B";
		}
		else if(score >=70) {
			grade = "C";
		}
		else if(score >=60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		System.out.println("당신의 학점은"+grade);
		
		System.out.println("-----------중첩 if문");
		String grade1 ="";
		System.out.print("점수 입력하세요: ");
		
		int score1 = in.nextInt();
		if(score1 >=90) {
			if(score1>=96) {
				grade1 = "A";
			}
			else {
				grade1 = "A";
			}	
		}
		else if(score1 >=80) {
			if(score1>=86) {
				grade1 = "B+";
			}
			else {
				grade1 = "B";
			}
		}
		else if(score1 >=70) {
			if(score1>=76) {
				grade1 = "C+";
			}
			else {
				grade1 = "C";
			}
		}
		else if(score1 >=60) {
			if(score1>=66) {
				grade1 = "D+";
			}
			else {
				grade1 = "D";
			}
		}		
		else {
			grade1 = "F";
		}
		System.out.println("당신의 등급은"+grade1);
		
		System.out.println("-------if절 코드블럭에 if를 중첩해서 A~F등급 출력프로그램 작성");
		System.out.print("점수를 입력하세요:");
		int score2 = in.nextInt();
		String grade2 = ""; 
		
		if(score2>60) {
			grade2 = "D";
			if(score2 >70) {
				grade2 = "C";
				if(score2>80) {
					grade2 = "B";
					if(score2 > 90) {
						grade2 = "A";
					}
				}
			}
		}
		else {
			grade2 = "F";
		}
		System.out.println("당신의 등급은 :"+grade2);
		
		System.out.println("--------------switch case");
		//switch의 조건문의 결과값을 case에서 찾아서 실행하는 형태
			//case에 결과값이 없을 시 default를 실행함
			//default는 반드시 필요한 것은 아님(else처럼)
			//switch case에서 break 미 입력 시 break를 만날 때 까지 계속 실행됨
		//break: 프로그램 실행 시 break만날 시 조건문, 반복문을 즉시 종료
		System.out.print("등수를 입력하세요");
		int rank = in.nextInt();
		
		switch(rank) {
		case 1:
			System.out.println("1등입니다");
			break;
		case 2:
			System.out.println("2등입니다");
			break;
		case 3:
			System.out.println("3등입니다");
			break;
		default:
			System.out.println("3등 이하입니다");
			break;
		}
		
		

		
	}

}
