package chap01;
import java.util.Scanner;
public class Chap01Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//p75 ����
//		System.out.println("----------��1----------");
//		double w;
//		double h;
//		double area;
//		
		Scanner in = new Scanner(System.in);
//		System.out.print("���簢���� ���� ���̸� �Է��ϼ���: ");
//		w = in.nextDouble();
//		System.out.println("���簢���� ���� ���̸� �Է��ϼ���: ");
//		h = in.nextDouble();
//		area = w*h;
//		System.out.println("���簢���� ���̴�: "+ area);
//		
//		System.out.println("----------��2----------");
//		int i;
//		System.out.println("������ �Է��ϼ���");
//		i = in.nextInt();
//		if(i==2*i-1) {
//			System.out.println("Ȧ��");
//		}
//		else {
//			System.out.println("¦��");
//		}
//		
//		System.out.println("----------���α׷��� ����1��----------");
//		String star ="";
//		for( int i1 =1; i1<7; i1++) {
//			for(int j1=6; j1>i1; j1--) {
//				star = star + " ";
//			}
//			for(int j2=1; j2<=i1*2-1; j2++) {
//				star = star +"*";
//			}
//			star = star + "\n";
//			
//		}
//		System.out.println(star);
//		
//		System.out.println("----------���α׷��� ����2��----------");
//		int jung= 0;
//		System.out.println("������ �Է��ϼ���");
//		jung = in.nextInt();
//		System.out.println(jung+"�� ������"+jung*jung);
//		
//		System.out.println("----------���α׷��� ����3��----------");
//		System.out.println("������� �ظ� ��������?");
//		double r = in.nextDouble();
//		System.out.println("������� ���̴�?");
//		double h1 = in.nextDouble();
//		final double PI =3.14; //������ ���ϸ� �ȵǴϱ� ����� ����
//		
//		System.out.println("������� ���Ǵ�:" + PI*r*r*h1);

		
		
		System.out.println("----------���α׷��� ����4��----------");
		System.out.println("�� ���� ������ �Է�");
		int second= in.nextInt();
		int sec = second%60;
		int min = second/60%60;
		int hour = second/60/60;
		
		System.out.print(hour+"�ð�"+min+"��"+sec+"��");
		
		System.out.println("----------���α׷��� ����6��----------");
		//(ȭ���µ� - 32) �� 1.8 = �����µ�
		System.out.println("ȭ���µ��� �Է�");
		double f = in.nextDouble();
		double c1 = (f-32)/ 1.8;
		System.out.println("ȭ��" + f+"�� ������ ��ȯ�ϸ�"+c1);

		System.out.println("----------���α׷��� ����7��----------");
		System.out.println("������ �Է��ض�");
		boolean and;
		boolean or;
		int num = in.nextInt();
		
		and = (num %4 == 0) && (num % 5==0);
		or = (num %4 == 0) || (num % 5==0);
		
		System.out.println(num+"�� �� ���� ��� ������ ����"+and);
		System.out.println(or+"�� �� ���� �ϳ��� ������ ����"+or);

		System.out.println("----------���α׷��� ����8��----------");
		System.out.println("0~999������ ������ �ϳ��� �Է��ϼ���: ");
		int num999= in.nextInt();
		int d = num999;
		int sum=0;
		
		sum = d%10; //������ 9 ���� ����
		d = d/10; //99.9 intŸ���̶� 99�� ��
		sum = sum+ (d%10); //9+9
		d = d/10;// 9
		sum = sum+ d;
		System.out.println(num999+"�� ��  �ڸ��� ����"+ sum+"�Դϴ�");

		System.out.println("----------���α׷��� ����9��----------");
		System.out.println("���� ���� �Է�");
		int aa= in.nextInt();
		System.out.println("���� ���� �Է�");
		int bb= in.nextInt();
		System.out.println("�Ϲ� ���� �Է�");
		int cc= in.nextInt();
		
		boolean result = (aa + bb + cc >=140) && 
				(
					(aa>=70) &&
					((bb>=30 &&cc >30) || (bb+cc>=80))
				);
		System.out.println(result);


		
	
	}

}
 