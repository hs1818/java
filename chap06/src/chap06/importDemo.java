package chap06;

import java.util.*; //java.util패키지에 있는 모든 클래스 로드
//import java.util.Scanner;
import com.pack.test.*; 

public class importDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		java.util.Scanner in = new java.util.Scanner(System.in); //import안쓰면 길게써야함
		Scanner in = new Scanner(System.in);
		//java lang은 기본패키지로 자동로딩되어 있어서 생략가능
		java.lang.System.out.print("이름을 입력해주세요: " );
		
		String name = in.next();
		System.out.println(name);
		
		System.out.println("------------------");
		//chap06패키지 calculator클래스 사용
		Calculator cal1 = new Calculator();
		cal1.output();
		//compack패키지 calculator클래스 불러와서 사용
		//class명 똑같으면 아래에 다 적어야함
		com.pack.test.Calculator cal2 = new com.pack.test.Calculator();
		cal2.output();
	}

}
