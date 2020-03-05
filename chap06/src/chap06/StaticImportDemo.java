package chap06;
import static java.util.Arrays.sort; //static메서드 sort()를 사용하기 위해 정적import사용

import java.util.Calendar; //일반import사용하여 Calendar클래스 사용

public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]data = {3,5,1,7};
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
//		Arrays.sort(data); //기본 사용방법
		sort(data); //static메서드인 sort()를 정적import로 로드하여 사용
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
		System.out.println(Calendar.JANUARY);
		Calendar.getInstance();
	}

}
