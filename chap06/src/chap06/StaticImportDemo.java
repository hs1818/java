package chap06;
import static java.util.Arrays.sort; //static�޼��� sort()�� ����ϱ� ���� ����import���

import java.util.Calendar; //�Ϲ�import����Ͽ� CalendarŬ���� ���

public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]data = {3,5,1,7};
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
//		Arrays.sort(data); //�⺻ �����
		sort(data); //static�޼����� sort()�� ����import�� �ε��Ͽ� ���
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
		System.out.println(Calendar.JANUARY);
		Calendar.getInstance();
	}

}
