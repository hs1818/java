package chap03;
import java.util.Scanner;
public class Chap03Ex2 {
	public static Scanner in = new Scanner(System.in); //Ŭ������ ��� ������ ����(�Ʒ��� �پ�������)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------p121 ��1");
		question01();
		question02();
		question03();
		question04();
	}
	
	public static void question01() {
		System.out.print("���̸� �Է��ϼ���");
		int age =in.nextInt();
		
		if(age >18) {
			System.out.println("����");
		}
		else {
			System.out.println("�̼���");
			}
		}
	
	public static void question02() {
		System.out.print("����� �Է��ϼ���");
		int x = in.nextInt();
		
		switch (x) {
		case 1:
			System.out.println("���� ���߽��ϴ�");
			break;
		case 2:
		case 3:
			System.out.println("���߽��ϴ�");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("�����Դϴ�");
			break;
		default:
			System.out.println("����ؾ߰ڽ��ϴ�");
			break;
		}
	}
	public static void question03() {
		int x = 0; //����ڰ� �Է��� ���� ����
		int y =0; //¦�� �� ���庯��
		
		do {
			System.out.print("������ �Է��ϼ���");
			x = in.nextInt();
			if(x >0 && x%2==0) {
				y=y+x;
			}
	}while(x>0);
		System.out.println("�Էµ� ���� ���� �� ¦���� ����:" +y);
	}
	
	public static void question04() {
		String x = "";
		for(int i =0; i<5; i++) {
			x = x+"*";
			System.out.println(x);
		}
	
	}
}
