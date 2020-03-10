package chap09;

//모든 클래스는 기본적으로 Object클래스를 상속받아 사용함(extend안써도)
public class Keyboard {
	String name;
	
	public Keyboard(String name) {
		this.name =name;
	}
	
	//object클래스가 제공하는 메서드 중 하나 equals
	//오버라이딩해서 기능변경
	public boolean equals(Object obj) {  
		if (obj instanceof Keyboard) {
			Keyboard k = (Keyboard) obj; //다시 keyboard타입으로 강제 타입 변환 
			
			//객체멤버변수 name과 받아온 매개변수 name이 같은지 비교
			if(this.name.equals(k.name)) { //이부분은 microsoft랑 같은지 비교하려고 만든거
				return true;
			}
		}
		return false;
	}
	
	//toString(): 해당 요소의 정보를 문자열로 출력하는 메서드
	//여기서는 오버라이딩해서 사용함(키보드입니다)
	public String toString() {
		return "키보드입니다";
	}
}


class Mouse{
	String name;
	
	public Mouse(String name) {
		this.name = name;
	}
}
