package chap06;

import java.util.*; //java.util��Ű���� �ִ� ��� Ŭ���� �ε�
//import java.util.Scanner;
import com.pack.test.*; 

public class importDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		java.util.Scanner in = new java.util.Scanner(System.in); //import�Ⱦ��� ��Խ����
		Scanner in = new Scanner(System.in);
		//java lang�� �⺻��Ű���� �ڵ��ε��Ǿ� �־ ��������
		java.lang.System.out.print("�̸��� �Է����ּ���: " );
		
		String name = in.next();
		System.out.println(name);
		
		System.out.println("------------------");
		//chap06��Ű�� calculatorŬ���� ���
		Calculator cal1 = new Calculator();
		cal1.output();
		//compack��Ű�� calculatorŬ���� �ҷ��ͼ� ���
		//class�� �Ȱ����� �Ʒ��� �� �������
		com.pack.test.Calculator cal2 = new com.pack.test.Calculator();
		cal2.output();
	}

}
