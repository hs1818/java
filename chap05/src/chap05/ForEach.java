package chap05;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[] =new int[] {100, 90, 50, 95, 85};
		int sum = 0;
		
		//�Ϲ�for��� -����ڰ� ó������ ����ġ ���ؾ���
		for(int i =0; i<scores.length; i++) {
			sum+= scores[i];
		}
		System.out.println("�Ϲ�for�� ���"+sum/5.0);
		
		//for each ��� -������ ÷���� ������ ����
		sum =0;
		for(int i:scores) {
			sum+= i;
		}
		System.out.println("for each�� ���"+sum/5.0);
	}

}
