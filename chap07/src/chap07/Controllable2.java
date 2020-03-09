package chap07;

public interface Controllable2 {
	default void repair() {
		System.out.println("장비 수리");
	}
	
	static void reset() {
		System.out.println("장비 초기화");
	}
	
	void turnOn();
	void turnOff();
}
