package chap07;

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Shape s = new Shape();  //shapeŬ������ �߻�Ŭ�����̹Ƿ� ��ü����x
		//�߻�Ŭ������ �ݵ��!! ��ӹ޾Ƽ� �ڽ�Ŭ������ ��ӹ��� �߻�޼��带 �������̵��Ͽ� �޼��带 �����ؼ� ����ؾ� ��
		Circle c = new Circle(3);
		c.draw();
		System.out.printf("���� ���̴� %.1f\n", c.findArea());
		
	}

}