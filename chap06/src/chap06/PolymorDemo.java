package chap06;

public class PolymorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles = new Vehicle[2]; //부모클래스 타입으로 선언
		vehicles[0] =new Car(); //각기 다른 타입
		vehicles[1] = new SportsCar();
		
		for(Vehicle v : vehicles) { //for each
			v.whoami(); //메서드 오버라이딩을 통해서 하나의 메서드로 여러개의 메서드를 실행한 효과
		}               //실제 실행은 whoami라는 메서드를 실행하지만 결과물은 다르게 출력됨
		
//		for(int i =0; i<vehicles.length; i++) {
//			vehicles[i].whoami();
//		}
	}
}

class SportsCar extends Car {
	void whoami() {
		System.out.println("나는 스포츠 자동차다");
	}
}
