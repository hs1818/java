package chap07;

public class Concrete extends Abstract{
	int j;
	
	public Concrete(int i, int j) {
		//�θ�Ŭ������ ����ڰ� ������ �����ڰ� ���� ��� �ڽ�Ŭ���� �����ڿ��� �θ�Ŭ���� �����ڸ� ȣ���ϴ� �κ��� �ʿ�
		super(i); 
		this.j = j;
	}

	void show() {
		System.out.println("i =" +i+", j = "+j);
	}
}
