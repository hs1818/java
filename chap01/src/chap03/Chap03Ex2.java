package chap03;
import java.util.Scanner;
public class Chap03Ex2 {
	public static Scanner in = new Scanner(System.in); //클래스의 멤버 변수로 선언(아래서 다쓸수있음)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------p121 문1");
		question01();
		question02();
		question03();
		question04();
	}
	
	public static void question01() {
		System.out.print("나이를 입력하세요");
		int age =in.nextInt();
		
		if(age >18) {
			System.out.println("성년");
		}
		else {
			System.out.println("미성년");
			}
		}
	
	public static void question02() {
		System.out.print("등수를 입력하세요");
		int x = in.nextInt();
		
		switch (x) {
		case 1:
			System.out.println("아주 잘했습니다");
			break;
		case 2:
		case 3:
			System.out.println("잘했습니다");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("보통입니다");
			break;
		default:
			System.out.println("노력해야겠습니다");
			break;
		}
	}
	public static void question03() {
		int x = 0; //사용자가 입력한 정수 저장
		int y =0; //짝수 합 저장변수
		
		do {
			System.out.print("정수를 입력하세요");
			x = in.nextInt();
			if(x >0 && x%2==0) {
				y=y+x;
			}
	}while(x>0);
		System.out.println("입력된 양의 정수 중 짝수의 합은:" +y);
	}
	
	public static void question04() {
		String x = "";
		for(int i =0; i<5; i++) {
			x = x+"*";
			System.out.println(x);
		}
	
	}
}
