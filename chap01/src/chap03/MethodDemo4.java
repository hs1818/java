package chap03;

public class MethodDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�޼��� �����ε�: �ϳ��� Ŭ������ ������ �̸��� �޼��尡 ������ ����
			//������ �����ε��� ������ �Ű������� ����, ������ Ÿ��, ��ȯ Ÿ���� ���� �޶����
		int i1=3;
		int i2=7;
		int i3=10;
		
		double d1 =7.0;
		double d2 =3.0;
		
		System.out.printf("max(%d,%d) = %d\n", i1,i2, max(i1, i2));
		System.out.printf("max(%.1f,%.1f) = %.1f\n", d1,d2, max(d1, d2));
		System.out.printf("max(%d,%d,%d) = %d\n", i1,i2,i3, max(i1, i2,i3));
		
		int x =10;
		int y =20;
		int z =30;
		
		sum();
		sum(x);
		sum(x,y);
		sum(x,y,z);
	}
	public static int max(int n1, int n2) {
		int result =n2;
		if(n1>n2) {
			result = n1;
		}
		return result;
	}
	
	public static double max(double n1, double n2) {
		double result =n2;
		if(n1>n2) {
			result = n1;
		}
		return result;
	}
	
	public static int max(int n1, int n2, int n3) {
		return max(max(n1,n2),n3);
		
//		int result =max(n1, n2); //������ Ǯ� ����
//		result = max(result,n3);
//		return result;
	}
	
	public static void sum() {
		System.out.println("�Ű��������� sum�Լ�");
	}
	public static void sum(int x) {
		System.out.println("�Ű����� 1�� sum�Լ�");
	}
	public static void sum(int x, int y) {
		System.out.println("�Ű�����2�� sum�Լ�");
	}
	public static void sum(int x, int y, int z) {
		System.out.println("�Ű�����3�� sum�Լ�");
	}
	
	

}
