package chap01;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner클래스의 객체를 생성하여 사용
		// new: 클래스의 복제체인 객체를 생성하는 명령어
		Scanner in = new Scanner(System.in); //scanner클래스를 객체화하여 in을 생성
		System.out.print("1번쨰 숫자를 입력하세요");
		int x = in.nextInt(); //키보드의 숫자 입력을 받는 메서드
		System.out.print("2번쨰 숫자를 입력하세요");
		int y = in.nextInt();
		System.out.println(x + "*" + y + "은"+x*y+"입니다");
		System.out.printf("%d * %d은 %d입니다. \n", x, y, x *y);
		
		//scanner클래스가 제공하는 데이터 입력 메서드
		//p61
		System.out.println("이름을 입력하세요");
		String name = in.next();
		System.out.println("입력된 이름은" +name +"입니다");
	}

}
