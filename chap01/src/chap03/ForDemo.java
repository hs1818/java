package chap03;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------for1 ");
		for(int i =1; i<5; i++) {
			System.out.print(i);
		}
		
		System.out.println("---------------for2");
		for (int row =2; row<10; row++) {
			for(int column =1; column <10; column++) {
				System.out.printf("%4d", row * column);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
