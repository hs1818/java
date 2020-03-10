package chap09;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("그랜저");  //객체가 생성되면 hashcode가 생성됨(객체마다 다 다름)
		Car yourCar = new Car("그랜저");
		
		//p 328
		//1번 문제 object클래스가 가지고 equals로 비교 
		System.out.println(myCar.equals(yourCar)); //따로 만들어서 false뜸 hashcode 다름
		System.out.println(myCar.toString(yourCar));
		
//		if(myCar instanceof Car) {
//			System.out.println("내 자동차는 ["+ myCar+"], 너 자동차는 ["+yourCar+"]로 모델이 같다");
//		}
//		else if(yourCar instanceof Car) {
//			System.out.println("내 자동차는 ["+ myCar+"], 너 자동차는 ["+yourCar+"]로 모델이 같다");
//		}
//		else {
//			System.out.println("내 자동차는 ["+ myCar+"], 너 자동차는 ["+yourCar+"]로 모델이 다르다");
//		}
		
	}

}
