package chap01;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scannerŬ������ ��ü�� �����Ͽ� ���
		// new: Ŭ������ ����ü�� ��ü�� �����ϴ� ��ɾ�
		Scanner in = new Scanner(System.in); //scannerŬ������ ��üȭ�Ͽ� in�� ����
		System.out.print("1���� ���ڸ� �Է��ϼ���");
		int x = in.nextInt(); //Ű������ ���� �Է��� �޴� �޼���
		System.out.print("2���� ���ڸ� �Է��ϼ���");
		int y = in.nextInt();
		System.out.println(x + "*" + y + "��"+x*y+"�Դϴ�");
		System.out.printf("%d * %d�� %d�Դϴ�. \n", x, y, x *y);
		
		//scannerŬ������ �����ϴ� ������ �Է� �޼���
		//p61
		System.out.println("�̸��� �Է��ϼ���");
		String name = in.next();
		System.out.println("�Էµ� �̸���" +name +"�Դϴ�");
	}

}
