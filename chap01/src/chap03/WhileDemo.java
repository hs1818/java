package chap03;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------while demo1");
		int i =1;
		while(i<5) {
			System.out.print(i);
			i++;
		}
		System.out.println("--------------while demo2");
		int row =2;
		while(row<10) {
			int column =1;
			while(column<10) {
				System.out.printf("%4d",row*column);
				column++;
			}
			System.out.println();
			row++;
		}
		
		System.out.println("--------------do while");
		int i1= 1;
		do {
			System.out.print(i1);
			i1++;
		}
		while(i1 <5);
		
		System.out.println("--------------do while dem02");
		int i2 = 10;
		do {
			i2++;
		}
		while (i2< 5);
		System.out.println("do while 실행 후:" +i2);
		
		i2=10;
		while(i2<5) {
			i2++;
		}
		System.out.println("while실행 후:" +i2);
		
		System.out.println("--------------do while dem03");
		int row1 =2;
		do {
			int column1 =1;
			do {
				System.out.printf("%4d", row1*column1);
				column1++;
			} while (column1 <10);
			System.out.println();
			row1++;
		} while(row1<10);
			
		
			
	}
	
	

}
