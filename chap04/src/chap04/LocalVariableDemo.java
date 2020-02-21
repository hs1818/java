package chap04;

public class LocalVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0; //지역변수 값을 0으로 초기화
		double b; //값 0으로 초기화 안함
//		System.out.print(b); //그래서 b사용불가
//		System.out.print(a+c); //변수 c 선언하지 않아서 사용불가
		int c =0;
		
//		public double d =0.0; //지역변수는 public 사용 불가 final만 사용가능
		
		for ( int e =0; e <10; e++) {
//			int a =1; //동일한 변수명 사용x
			System.out.print(e);
		}
	}

}
