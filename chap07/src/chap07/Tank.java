package chap07;

public class Tank extends Unit{
	public Tank(String name, int hp) {
		super(name,hp);
	}
	
//	public void drive() {
//		System.out.println(name+"������ ��ҷ� �̵��մϴ�");
//	}
	
	public void move() {
		System.out.println(name+"�� ��� Ǯ�� ������ ��ҷ� �̵��մϴ�");
	}
}
