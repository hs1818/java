package chap10;

public class TryCatch2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend =10;
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend/divisor);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("��������x");
		}catch (NumberFormatException e) {
			System.out.println("���ھƴ�");
		}catch (ArithmeticException e ) {
			System.out.println("0���� ������");
		}finally {
			System.out.println("�׻� ����");
		}
		System.out.println("����");
	}

}
