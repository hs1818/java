package javaReview;

public class review01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�޼���: �ڹٽ�ũ��Ʈ�� �Լ��� ������ ����, � Ư���� ����� �����ϱ� ���� �ڵ��� ����,
		�Լ��� ȥ�ڼ� �۵������� �޼���� Ŭ������ ����� ���ԵǾ� ���� */
		//�޼��� �����ε�: �ϳ��� Ŭ���� ������ ������ �̸��� �޼��带 ������ ����ϴ� ��
		//�����ε� ����: 1. �Ű����� ������ �ٸ� 2. �Ű������� Ÿ���� �ٸ�
		sum();
		sum(10, 10);
		sum(10);
		
		min();
		min(10, 10);
		min(10);
		
		x();
		x(10, 10);
		x(10);
		
		
	}
	
	public static void sum() {
		int a =10;
		int b =10;
		int c = a +b; 
		System.out.println("a +b =" + c);
	}
	
	public static void sum(int a, int b) {
		int c = a +b; 
		System.out.println("a +b =" + c);
	}
	public static void sum(double a) {
		double b =10;
		double c = a +b; 
		System.out.println("a +b =" + c);
	}
	
	public static void min() {
		int a =10;
		int b =10;
		int c = a -b; 
		System.out.println("a -b =" + c);
	}
	
	public static void min(int a, int b) {
		int c = a -b; 
		System.out.println("a -b =" + c);
	}
	public static void min(int a) {
		int b =10;
		int c = a -b; 
		System.out.println("a -b =" + c);
	}
	
	public static void x() {
		double a =10;
		double b =10;
		double c = a *b; 
		System.out.println("a -b =" + c);
	}
	
	public static void x(double a, double b) {
		double c = a *b; 
		System.out.println("a -b =" + c);
	}
	public static void x(double a) {
		double b =10;
		double c = a *b; 
		System.out.println("a -b =" + c);
	}
	

}
