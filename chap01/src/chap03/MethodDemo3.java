package chap03;

public class MethodDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� ���� ���ϰ� ���� ���ϰ� ���� ���� ����ϴ� �޼��� 4���� ������� ����
		System.out.println("-------------------1��");
		method1();
		System.out.println("-------------------2��");
		method2(20,5);
		System.out.println("-------------------3��");
		int[] result3 = new int[4];
		result3 = method3();
		System.out.println("����a+b:" +result3[0]);
		System.out.println("����a+b:" +result3[1]);
		System.out.println("����a+b:" +result3[2]);
		System.out.println("����a+b:" +result3[3]);
		System.out.println("-------------------4��");
		int[] result4 = new int[4];
		result4 = method4(20,5);
		System.out.println("����a+b:" +result4[0]);
		System.out.println("����a+b:" +result4[1]);
		System.out.println("����a+b:" +result4[2]);
		System.out.println("����a+b:" +result4[3]);
		
	}
	
	//1�����
	public static void method1() {
		int a =20;
		int b = 5;
		int c =a+b;
		System.out.println("���� a+b��:"+ c);
		c= a-b;
		System.out.println("���� a-b��:"+ c);
		c= a*b;
		System.out.println("���� a*b��:"+ c);
		c= a/b;
		System.out.println("���� a/b��:"+ c);
	}
	
	//2�����
	public static void method2(int a, int b) {
		int c =a+b;
		System.out.println("�Ű����� a+b��:"+ c);
		c= a-b;
		System.out.println("�Ű����� a-b��:"+ c);
		c= a*b;
		System.out.println("�Ű����� a*b��:"+ c);
		c= a/b;
		System.out.println("�Ű����� a/b��:"+ c);
	}

	//3�����
	public static int[] method3() {
		int a=20;
		int b=5;
		int[]c= new int[4]; //�迭 ����
		c[0] = a+b;
		c[1] = a-b;
		c[2] = a*b;
		c[3] = a/b;
//		c[4 = 100;] //����� �迭 �ִ�ũ�⸦ ����� ���� �߻�
		return c;
	}

	//4�����
	public static int[] method4(int a, int b) {
		int[]c = new int[4];
		c[0] = a+b;
		c[1] = a-b;
		c[2] = a*b;
		c[3] = a/b;
		return c;
	}
}
