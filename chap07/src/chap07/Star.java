package chap07;

public class Star {
	
	public static void main(String[] args) {
		Marine m = new Marine("����", 100);
		m.move();
//		m.run();
		m.stop();
		m.attack();
		
		Tank t = new Tank("��ũ", 300);
		t.move();
//		t.drive();
		t.stop();
		t.attack();
		
//		Wraith w = new Wraith("���̽�", 250); //move�Ⱦ��� �߻�Ŭ���� �Ǽ� ��ü�����ȵ�(wraith�� �ٸ��ְ� ��ӹ޾Ƽ� move�����)
//		w.move();
////		w.fly();
//		w.stop();
//		w.attack();
	}
}
