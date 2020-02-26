package chap05;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[] =new int[] {100, 90, 50, 95, 85};
		int sum = 0;
		
		//일반for사용 -사용자가 처음부터 끝위치 정해야함
		for(int i =0; i<scores.length; i++) {
			sum+= scores[i];
		}
		System.out.println("일반for문 평균"+sum/5.0);
		
		//for each 사용 -무조건 첨부터 끝까지 진행
		sum =0;
		for(int i:scores) {
			sum+= i;
		}
		System.out.println("for each문 평균"+sum/5.0);
	}

}
