package chap05;
import java.util.ArrayList; //arraylist는 기본자료형이 아니라 클래스 추가해야 함
import java.util.Scanner;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//integer는 int타입의 원형
		ArrayList<Integer>scores =new ArrayList<>();
		
		int data;
		int sum=0;
		
		while((data =in.nextInt()) >0) { //음수가 아닐때까지 무한반복
			scores.add(data);
		}
		
		for(int i =0; i<scores.size(); i++) {
			sum += scores.get(i);
		}
		System.out.println("평균 =" +sum/scores.size());
		
		ArrayList<String>test = new ArrayList<>();
		System.out.println(test.size());
		test.add("ArrayList");
		System.out.println(test.size());
		test.add("배열과 크기가 비슷하지만");
		System.out.println(test.size());
		test.add("크기가 동적으로");
		System.out.println(test.size());
		test.add("조절가능");
		System.out.println(test.size());
		
		System.out.println("--------------");
		String arrStr[] =new String[5];
		System.out.println(arrStr.length);
		arrStr[0] ="배열은";
		System.out.println(arrStr.length);
		arrStr[1] ="ArrayList와 비슷하지만";
		System.out.println(arrStr.length);
		arrStr[2] ="크기가";
		System.out.println(arrStr.length);
		arrStr[3] ="고정되어 있음";
		System.out.println(arrStr.length);
		
	}

}
