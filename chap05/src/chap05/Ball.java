package chap05;

public class Ball extends Circles{
	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color+ "���̴�");
	}
	
	public void findVolume() {
		System.out.println("���Ǵ� 4/3 * (n * ������*������*������)�̴�");
	}
	
	//�޼��� �������̵� : �θ� Ŭ�����κ��� ��ӹ��� �޼��� ������ �����Ͽ� ���
		// ������ 100�� �����ؾ���, �����ڵ�κ��� �ڽ�Ŭ������ �°� �����ؼ� ���
	
	@Override //������̼�: Ư������� �߰��ϴ� ȿ�� (�ᵵ�ǰ� �Ƚᵵ�ǰ�)
			//��� �� �������̵� ��Ģ�� Ʋ����� �����޽����� ��
	public void findArea() {
		findRadius();
		super.findArea(); 	//super���
		System.out.println("���̴� (4 * ������* ������)�̴�");
	}
}
