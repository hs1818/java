package chap07;

public class Marine extends Unit{
	
	public Marine(String name, int hp) {
		super(name,hp);
	}
	
	//������ �̵��� ���� ����ϴ� �޼���
//	public void run() {
//		System.out.println(name+"������ ��ҷ� �̵��մϴ�");
//	}
	
	public void move() {
		System.out.println(name+"�� ������ ���� ������ ��ҷ� �̵��մϴ�");
	}
}
