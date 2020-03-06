package chap07;

abstract public class Unit {
	int hp;
	String name;
	
	public Unit(String name, int hp) {
		this.hp = hp;
		this.name = name;
	}
	
	void attack() {
		System.out.println(name+"대상 공격합니다");
	}
	
	void stop() {
		System.out.println(name+"이동을 멈춥니다");
	}
	
	//오버라이딩해서 사용하세요
	//유닛 전체 이동시 사용하세요
	abstract void move(); 
//	void move() {
//		System.out.println(name+"지정한 장소로 이동합니다");
//	}
}
