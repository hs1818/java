package chap09;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2의 8승
		System.out.println("Math.pow(2,8): "+Math.pow(2, 8));
		//0.0~1.0 랜덤
		System.out.println("Math.random(): "+Math.random());
		//sin값 출력
		System.out.println("Math.sin(Math.PI): "+Math.sin(Math.PI));
		//최소값
		System.out.println("Math.min(10,20): "+Math.min(10,20));
		
		String str = "문자열";
		System.out.println(str);
		str = str +"추가된 문자열";
		System.out.println(str);
	}

}
