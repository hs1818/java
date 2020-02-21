package chap04;

class Printer {
	int numOfPapers =0;
	
	void print(int amount) {
		System.out.println(amount+"장 프린트 했습니다");
		numOfPapers= numOfPapers - amount;
		System.out.println(numOfPapers+"장 남았습니다");
		
		
	}
}

class Printer2 {
	private int numOfPapers =0; //캡슐화로 숨김
	
	public Printer2 (int paper) { //매개변수 1개인 생성자
		numOfPapers =paper; 
	}
	
	public String getNumOfPapers() {
		String result ="";
		if(numOfPapers >0) {
			result = "현재"+ numOfPapers +"남아있다";
		}
		else {
			result = "용지가 읎다";
		}
		return result;
	}
	
	void print(int amount) {
		if(numOfPapers >0) {
			if(numOfPapers > amount) {
				numOfPapers = numOfPapers -amount;
				System.out.println(amount+"장 출력했고 현재"+numOfPapers+"장 남음");
			}
			else {
				int missPapers =amount -numOfPapers;
				System.out.println("모두 출력하려면 용지가" +missPapers + "장 부족합니다"+numOfPapers+"장만 출력함");
				numOfPapers=0;
			}
		}
		else {
			System.out.println("용지읎다");
		}
	}
}


public class Chap04Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p1 =new Printer();
		p1.numOfPapers =100;
		p1.print(70);
		
		Printer2 p2 =new Printer2(10);
		p2.print(2);
		p2.print(20);
		System.out.println(p2.getNumOfPapers());
		
		
	}

}
