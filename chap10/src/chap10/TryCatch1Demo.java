package chap10;

public class TryCatch1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,1,2};
		try {
			System.out.println(array[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("��������x" +e.toString());
		}
		System.out.println("������");
	}

}