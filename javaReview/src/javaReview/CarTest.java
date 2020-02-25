package javaReview;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 c1= new Car2("red");
		Car2 c2= new Car2("blue");
		Car2 c3= new Car2("RED");
		System.out.printf("자동차 수: %d, 빨간색 자동차 수 : %d", Car2.getNumOfCar(), Car2.getNumOfRedCar());
				//클래스 명 그대로 사용 = 해당 멤버변수가 static
	}

}

class Car2 {
	String color; //색상 저장 변수
	private static int numOfCar =0; //각 객체에서 모두 공유하는 변수, 차량의 수 저장변수
	private static int numOfRedCar =0;// 색상red차량 수 저장변수
	
	public static int getNumOfCar() {
		return numOfCar; //캡슐화 된 전체차량 수를 가져오는 메서드
	}
	
	public static int getNumOfRedCar() { //red차량수 가져오기
		return numOfRedCar;
	}
	
	public Car2(String color) { //클래스 Car2의 생성자: 반환타입 입력부분없음
		this.color = color;
		numOfCar++; //총 차량 수 증가
		
		if(color =="red"|| color == "RED" ) {
			numOfRedCar++; //red차 수 증가
		}
	}
}