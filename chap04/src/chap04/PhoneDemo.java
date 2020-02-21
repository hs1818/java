package chap04;

//서브클래스, 메인클래스인 PhoneDemo를 실행하기 위해서 필요한 클래스
//설계도이기때문에 실행시 필요한 ()가 없음
class Phone {
	String model; //모델명 저장변수
	int value; //가격 저장변수
	
	void print() { //void 반환값 없음
		System.out.println(value+ "만 원짜리 " + model + " 스마트폰");
	}
}
//메인클래스: 메인으로 동작하는 클래스에만 접근제한자를 public으로 사용
public class PhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myPhone = new Phone(); //클래스 phone을 new키워드를 통해서 인스턴스(객체)화 함
		myPhone.model = "갤럭시S20"; //model 멤버변수 갖고 있음(위에꺼)
		myPhone.value = 100;
		myPhone.print(); //print()멤버 메서드를 가지고 있음
		
		Phone yourPhone = new Phone();
		yourPhone.model ="G6";
		yourPhone.value =85;
		yourPhone.print();
	}

}
