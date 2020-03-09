package chap07;

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 c1 = new Circle2(5.0);
		Circle2 c2 = new Circle2(6.0);
		
		if(c1.compareTo(c2) > 0) {
			System.out.println("ù���� ���� �ι�° ������ ũ��");
		}
		else if (c1.compareTo(c2) ==0) {
			System.out.println("�� ���� ũ�Ⱑ ����");
		}
		else {
			System.out.println("ù��° ���� �ι�° ������ �۴�");
		}
	}

}

//�ڹٿ��� �⺻���� �����ϴ� comparable�������̽� ������ ��ü��
//�������̽� comparable�� �߻�޼��� compareTo�� �������̵��� ���
class Circle2 implements Comparable { 
	double radius;
	
	public Circle2(double radius) {
		this.radius = radius;
	}
	
	//object�� �ڹٿ��� ���� ū Ÿ������ �ڹ��� ��� Ŭ������ objectŬ������ ������
	//circle2�� ��ü c2�� �Ű������� �޾� object o�� ������ ����
	//object o�� �����Ͱ� ����Ǹ� �ڵ�Ÿ�Ժ�ȯ�� �߻�(objectŸ������ �޾Ƽ�)
	
	@Override
	public int compareTo(Object o) {
		Circle2 c = (Circle2) o; //�ٽ� circle2 o�� ���� ����Ÿ�Ժ�ȯ ����
		if(this.radius > c.radius) {
			return 1;
		}
		else if(this.radius == c.radius) {
			return 0;
		}
		else {
			return -1;
		}
	}
}
