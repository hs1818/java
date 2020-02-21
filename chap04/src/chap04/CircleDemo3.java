package chap04;

public class CircleDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle3 myCircle = new Circle3();
	//�������, circle3Ŭ���� ��� ������ ���� ����
	//���� �Է��ϴ� ���¶� �Է��� ���� ��Ȯ���� ������ �� ����
	//ex) 5.0~9.9���� ������ �ִٰ� ���������� �����Ǿ� ���� ��
	//�߿� ��� ����, �޼��� ���� �ܺη� �������� �ʰ� getter,setter�� ���� �����͸� �Է��ϰ� �������� ��� ���
//		myCircle.radius = 10.0;
		myCircle.setRadius(10.0);
//		myCircle.show(myCircle.radius, myCircle.findArea());
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
		
	}

}

class Circle3 {
	//��� ������ �޼��忡 ���������� private ���� �� �ܺ����� �Ұ���
	private double radius;
	final double PI = 3.14;
		
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double value) {
		radius = value;
	}
	
	double findArea() {
		return 3.14 * getRadius() * getRadius();
	}
	
	void show(double x, double y) {
		System.out.printf("������ = %.1f, ���� = %.1f\n", x, y);
	}

}
