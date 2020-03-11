package chap10;

//���׸�Ŭ���� ����
//numberŬ������ ���׷��� ��ӹ޾� �������� ��밡���ϵ��� �����ض� (2���� �ʵ�� ���ڸ� ��Ÿ���� � Ÿ�Ե� �� �� �ִ�)
public class Pair<T extends Number> {
	private T num1; //��� ���� Ÿ���̵� ��� ������ ������ ���׸� Ÿ�Ը�� ����
	private T num2;
	
	public Pair(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public T first() {
		return num1;
	}
	
	public T second() {
		return num2;
	}
}
