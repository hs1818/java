package chap01;
import java.util.Scanner;
public class Chap01Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//p75 문제
//		System.out.println("----------문1----------");
//		double w;
//		double h;
//		double area;
//		
		Scanner in = new Scanner(System.in);
//		System.out.print("직사각형의 가로 길이를 입력하세요: ");
//		w = in.nextDouble();
//		System.out.println("직사각형의 세로 길이를 입력하세요: ");
//		h = in.nextDouble();
//		area = w*h;
//		System.out.println("직사각형의 넓이는: "+ area);
//		
//		System.out.println("----------문2----------");
//		int i;
//		System.out.println("정수를 입력하세요");
//		i = in.nextInt();
//		if(i==2*i-1) {
//			System.out.println("홀수");
//		}
//		else {
//			System.out.println("짝수");
//		}
//		
//		System.out.println("----------프로그래밍 문제1번----------");
//		String star ="";
//		for( int i1 =1; i1<7; i1++) {
//			for(int j1=6; j1>i1; j1--) {
//				star = star + " ";
//			}
//			for(int j2=1; j2<=i1*2-1; j2++) {
//				star = star +"*";
//			}
//			star = star + "\n";
//			
//		}
//		System.out.println(star);
//		
//		System.out.println("----------프로그래밍 문제2번----------");
//		int jung= 0;
//		System.out.println("정수를 입력하세요");
//		jung = in.nextInt();
//		System.out.println(jung+"의 제곱은"+jung*jung);
//		
//		System.out.println("----------프로그래밍 문제3번----------");
//		System.out.println("원기둥의 밑면 반지름은?");
//		double r = in.nextDouble();
//		System.out.println("원기둥의 높이는?");
//		double h1 = in.nextDouble();
//		final double PI =3.14; //원주율 변하면 안되니까 상수로 선언
//		
//		System.out.println("원기둥의 부피는:" + PI*r*r*h1);

		
		
		System.out.println("----------프로그래밍 문제4번----------");
		System.out.println("초 단위 정수를 입력");
		int second= in.nextInt();
		int sec = second%60;
		int min = second/60%60;
		int hour = second/60/60;
		
		System.out.print(hour+"시간"+min+"분"+sec+"초");
		
		System.out.println("----------프로그래밍 문제6번----------");
		//(화씨온도 - 32) ÷ 1.8 = 섭씨온도
		System.out.println("화씨온도를 입력");
		double f = in.nextDouble();
		double c1 = (f-32)/ 1.8;
		System.out.println("화씨" + f+"를 섭씨로 변환하면"+c1);

		System.out.println("----------프로그래밍 문제7번----------");
		System.out.println("정수를 입력해라");
		boolean and;
		boolean or;
		int num = in.nextInt();
		
		and = (num %4 == 0) && (num % 5==0);
		or = (num %4 == 0) || (num % 5==0);
		
		System.out.println(num+"은 두 수로 모두 나누어 진다"+and);
		System.out.println(or+"은 두 수중 하나로 나누어 진다"+or);

		System.out.println("----------프로그래밍 문제8번----------");
		System.out.println("0~999까지의 정수를 하나만 입력하세요: ");
		int num999= in.nextInt();
		int d = num999;
		int sum=0;
		
		sum = d%10; //나머지 9 변수 저장
		d = d/10; //99.9 int타입이라 99가 됨
		sum = sum+ (d%10); //9+9
		d = d/10;// 9
		sum = sum+ d;
		System.out.println(num999+"의 각  자리의 합은"+ sum+"입니다");

		System.out.println("----------프로그래밍 문제9번----------");
		System.out.println("전공 학점 입력");
		int aa= in.nextInt();
		System.out.println("교양 학점 입력");
		int bb= in.nextInt();
		System.out.println("일반 학점 입력");
		int cc= in.nextInt();
		
		boolean result = (aa + bb + cc >=140) && 
				(
					(aa>=70) &&
					((bb>=30 &&cc >30) || (bb+cc>=80))
				);
		System.out.println(result);


		
	
	}

}
 