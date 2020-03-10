package chap07;

abstract public class Controller {
	boolean power; 
	
	public Controller(boolean power) {
		this.power =power;
	}
	void show() {
		if(power == true) { //boolean타입은 true false만 가지고 있음(power만 적어도됨)
			System.out.println(getName()+"가 켜짐");
		}
		else {
			System.out.println(getName()+"가 꺼짐");
		}
	}
	
	abstract String getName();
}
