package chap01;
import java.util.Scanner;
public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//연산자 -자바스크립트와 동일
		//산술 연산자: +,-,*,/% 4칙연산. *,/,%가 +,-보다 우선순위 빠름
		//증감: ++, -- 1만큼 증가or감소, 우선순위가 가장 빠름
			//해당 연산자가 피 연산자의 앞에 있을 경우 연산식을 실행하기 전에 데이터를 증감시킴
			//해당 연산자가 피 연산자의 뒤에 있을 경우 연산식을 실행한 후에 데이터를 증감시킴
		System.out.println("-----증감");
		int data = 10;
		System.out.println("변수 data의 값:" + data);
		data++;
		System.out.println("증감 사용 후 data의 값"+data);
		data++;
		System.out.println("증감 사용 후 data의 값"+data);
		
		int data2 = 10;
		System.out.println("원본 data2값"+ data2);
		System.out.println("전위증감 연산자로 값 증가 후 data2의 값:" + ++data2);
		System.out.println("후위증감 연산자로 값 증가 후 data2의 값:" + data2++);
		System.out.println("현재 data2의 값:" +data2);
		System.out.println("후위 증감연산자로 값 감소 후 data2의 값:" + data2--);
		System.out.println("전위 증감연산자로 값 감소 후 data2의 값:" + --data2);
		System.out.println("현재 data2의 값:" +data2);
		
		System.out.println("---------조건(3항)연산자"); //햇갈리니 if else가 편함
		int a =1;
		int b;
		b = (a==1)?10:20;
		System.out.println(b);
		b = (a > 1)? a++ : a+20;
		System.out.println(a);
		System.out.println(b);
		
		
		//대입: =, +=, -=, *=, /=, %=, 연산 우선순위가 가장 느림
		//비교: >, >=, <, <=, ==, !=, instanceof(클래스 복제체 객체를 해당 클래스와 비교하기 위한 것), 데이터의 값or 타입 비교
		System.out.println("-----대입/비교");
		String str =new String();
		StringBuilder sb = new StringBuilder();
		
		if(str instanceof String) {
			System.out.println("str은 string의 객체입니다");
		}
		else {
			System.out.println("str은 string의 객체가 아닙니다");
		}
		
		if(sb instanceof StringBuilder) {
			System.out.println("sb은 StringBuilder의 객체입니다");
		}
		else {
			System.out.println("sb은 StringBuilder의 객체가 아닙니다");
		}
		
		//비트: &,!,~,^ 
		//논리: %%,||, ~ 주로 if문에서 조건을 2개 이상 사용하고자 할 경우 사용
		System.out.println("---산술 연산 예제");
		int remainer = 25%2;
		System.out.println("25/2의 나머지는"+ remainer+"입니다");
		
		System.out.println("---비교/논리연산 예제");
		int x =0;
		int y =1;
		System.out.println((x<1) || (y-- <1));
		System.out.println("x=" + x+ ",y =" +y);
		
		x= 0;
		y=1;
		System.out.println((x<1) | (y-- <1));
		System.out.println("x=" + x+ ",y =" +y);
		
		System.out.println("--------비트/시프트 연산자");
		System.out.printf("%x\n", 0b0101 & 0b0011);
		System.out.printf("%x\n", 0b0101 | 0b0011);
		System.out.printf("%x\n", 0b0101 ^ 0b0011);
		System.out.printf("%x\n", (byte)~ 0b00000001);
		System.out.printf("%x\n", 0b0110 >> 2);
		System.out.printf("%x\n", 0b0110 << 2);
		
		int i1 = -10;
		int i2 = i1 >> 1;
		int i3 = i1 >>> 1;
		System.out.printf("%x->%d\n", i1, i1);
		System.out.printf("%x->%d\n", i2, i2);
		System.out.printf("%x->%d\n", i3, i3);
		
		
		
	}

}
