package chap07;

public interface Controllable2 {
	default void repair() {
		System.out.println("��� ����");
	}
	
	static void reset() {
		System.out.println("��� �ʱ�ȭ");
	}
	
	void turnOn();
	void turnOff();
}
