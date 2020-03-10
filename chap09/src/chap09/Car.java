package chap09;

import java.text.MessageFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Car {
	private String model;
	public Car(String model) {
		this.model = model;
	}
	
	//2번문제는 equals()를 오버라이딩 하여 사용
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car c = (Car) obj;
			
			if(model.equals(c.model)) {
				return true;
			}
		}
		return false;
	}
	
	//1번문제
	public String toString(Object obj) {
//		//현재 클래스 car는 object를 상속받아서 equals메서드를 직접사용 가능
//		boolean result = equals(obj);
//		String str ="";
//		Car c = (Car) obj;  //원래대로 타입변환(car클래스 타입으로)
//							//매개변수로 넘어온 yourCar부분 모델 매개변수 쓰기위해서 
//		
//		if(result ==true) {
//			str = "내 자동차는 ["+ this.model+"], 너 자동차는 ["+c.model+"]로 모델이 같다";
//		}
//		else {
//			str = "내 자동차는 ["+ this.model+"], 너 자동차는 ["+c.model+"]로 모델이 다르다";
//		}
//		return str;

	
	//3번문제
	Date d = new Date(); //현재시간 가져오기
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); //출력형식 지정
	
	String str = MessageFormat.format("자동차 모델이 둘다 [{0}]로 동일하다\n날짜: {1}, 자동차모델 =[{0}], "
			+ "운전자({2}", model,sdf.format(d), "홍길동");
	
	return str;
	}
}

