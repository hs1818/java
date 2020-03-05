package chap06;

public class OverTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v =new Vehicle();
		System.out.println(v.name);
		v.whoami(); //오버라이딩 된 whoami가 실행
		v.move();
		
		System.out.println("--------------------");
		Car c = new Car();
		System.out.println(c.name);
		c.whoami();
		c.move();
		
		System.out.println("---------------");
		v =c;
		System.out.println(v.name);
		v.whoami();
		v.move();
		
	}

}

class Vehicle {
	String name ="탈것";
	
	void whoami() {
		System.out.println("나는 탈 것이다");
	}
	
	//static사용해서 상속x 오버라이딩 불가
	static void move() {
		System.out.println("이동하다");
	}
}

class Car extends Vehicle {
	String name ="자동차";
	
	//오버리이딩됨
	void whoami() {
		System.out.println("나는 자동차다");
	}
	
	static void move() {
		System.out.println("달리다");
	}
}