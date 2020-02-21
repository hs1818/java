package chap03;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바스크립트와 거의 동일
		
		System.out.println("-----------------break1");
		int i =1;
		int j =5;
		
		while (true) {
			System.out.print(i++);
			if(i>=j)
				break;
		}
		
		System.out.println("-----------------break2");
		int row =2;
		while(row < 10) {
			int column =1;
			while(column <10) {
				System.out.printf("%4d", row * column);
				column++;
				if (column >=5) {
					break;
				}
			}
			System.out.println();
			row++;
		}
		
		System.out.println("-----------------레이블 사용 break3");
		int row1 =2;
		out: while(row1 < 10) {
			int column =1;
			while(column <10) {
				System.out.printf("%4d", row1 * column);
				column++;
				if (column >=5) {
					break out;
				}
			}
			System.out.println();
			row1++;
		}
		
		System.out.println();
		System.out.println("---------------continue");
		//continue: 반복문 실행 중 continue를 만나면 해당 루프의 실행을 중지하고 반복조건을 확인하여 다음 루프로 이동
		for(int x=1; x<10; x++) {
			if(x %2 ==0) {
				continue;
			}
			System.out.println(x);
		}
		
	}

}
