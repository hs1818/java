package chap10;

public class TryCatch2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend =10;
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend/divisor);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("원소존재x");
		}catch (NumberFormatException e) {
			System.out.println("숫자아님");
		}catch (ArithmeticException e ) {
			System.out.println("0으로 못나눔");
		}finally {
			System.out.println("항상 실행");
		}
		System.out.println("종료");
	}

}
