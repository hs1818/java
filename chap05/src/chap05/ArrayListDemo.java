package chap05;
import java.util.ArrayList; //arraylist�� �⺻�ڷ����� �ƴ϶� Ŭ���� �߰��ؾ� ��
import java.util.Scanner;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//integer�� intŸ���� ����
		ArrayList<Integer>scores =new ArrayList<>();
		
		int data;
		int sum=0;
		
		while((data =in.nextInt()) >0) { //������ �ƴҶ����� ���ѹݺ�
			scores.add(data);
		}
		
		for(int i =0; i<scores.size(); i++) {
			sum += scores.get(i);
		}
		System.out.println("��� =" +sum/scores.size());
		
		ArrayList<String>test = new ArrayList<>();
		System.out.println(test.size());
		test.add("ArrayList");
		System.out.println(test.size());
		test.add("�迭�� ũ�Ⱑ ���������");
		System.out.println(test.size());
		test.add("ũ�Ⱑ ��������");
		System.out.println(test.size());
		test.add("��������");
		System.out.println(test.size());
		
		System.out.println("--------------");
		String arrStr[] =new String[5];
		System.out.println(arrStr.length);
		arrStr[0] ="�迭��";
		System.out.println(arrStr.length);
		arrStr[1] ="ArrayList�� ���������";
		System.out.println(arrStr.length);
		arrStr[2] ="ũ�Ⱑ";
		System.out.println(arrStr.length);
		arrStr[3] ="�����Ǿ� ����";
		System.out.println(arrStr.length);
		
	}

}
