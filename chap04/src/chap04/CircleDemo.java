package chap04;

public class CircleDemo {
	static double radius; //Ŭ���� �������
	static double findArea() {
		//������� radius��� �� ������ Ŭ���� ������ ����ϹǷ� ��ü�� ������ �ʰ� �ٷ� ���
		return 3.14 *radius * radius; 
	}
	
	static void show(double x, double y) {
		System.out.printf("������ = %.1f, ���� =%.1f\n", x,y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		radius = 10.0;
		double area = findArea();
		show(radius, area);
		
		TestClass ts= new TestClass();
		ts.test();
	}
}

class TestClass{
	 int xx= 100;
	 int yy =200;
	 
	//this: ��ü �ڱ� �ڽ��� ���ϴ� Ű����
		// �Ű������� ���������� ����� �̸� ���Ƶ� ���������� �켱����, ������� �����Ϸ��� this���
	 void test() {
		int xx =1000; //���������� ��������� ����
		int yy =2000;
		System.out.println("��������xx�� ��: " + xx + "\n�������� yy�� ��: "+ yy);
		System.out.println("Ŭ������� ����xx�� ��: " + this.xx + "\nŬ������� ���� yy�� ��: "+ this.yy);
	}
}
