package chap07;

public class CoinDemo1 {
	public static void main(String[] args) {
		//Coin.DIME은 인터페이스가 가지고 있는 상수이므로 static키워드가 사용되어 있어 객체생성없이 (인터페이스명.상수명) 형태로 사용가능
		//상속받지 않았으니 인터페이스명 앞에 써줘야댐
		System.out.println("Dime은"+Coin.DIME + "센트입니다");
	}
}

//인터페이스에서 사용할 수 있는 멤버는 상수, 추상메서드, default메서드, static메서드만 사용 가능
//인터페이스의 멤버로 int PENNY =1; 사용가능 이유는 final static 키워드가 생략되어 있음(컴파일 시 자동으로 추가)
interface Coin {
	final static int PENNY =1;
	int NICKEL =5;
	int DIME =10;
	int QUARTER =25;
}
