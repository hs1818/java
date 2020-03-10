package chap07;

abstract public class Controller {
	boolean power; 
	
	public Controller(boolean power) {
		this.power =power;
	}
	void show() {
		if(power == true) { //booleanŸ���� true false�� ������ ����(power�� �����)
			System.out.println(getName()+"�� ����");
		}
		else {
			System.out.println(getName()+"�� ����");
		}
	}
	
	abstract String getName();
}
