package chap06;

public class GirlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl[] girls = {
				new Girl("갑순이"),
				new GoodGirl("콩쥐"),
				new BestGirl("황진이")
		};
		for (Girl g :girls) {
			g.show(); //다형성을 이용하여 여러개 메서드 실행
		}
//		Girl g1 =new Girl();
//		//부모클래스 Girl사용하고 자식클래스 Goodgirl의 객체생성 //부모클래스 타입으로 선언되기때문에 girl클래스가 가진 멤버만 사용 가능
//		Girl g2 = new GoodGirl();
//		//부모클래스 goodgirl의 객체로 변수 생성하고 생성자를 자식클래스Bestgirl생성자를 사용해 객체생성 /부모클래스 goodgirl멤버만 사용가능
//		GoodGirl gg = new BestGirl();
//		
//		g2.show();
//		gg.show(); //Bestgirl클래스에서 show메서드 상속받아 오버라이딩 하여 사용 
	}

}

class Girl {
	protected String name; //상속받은 클래스 접근가능, 외부접근 제한
	void show() {
		System.out.println(this.name+"는 자바 초보자이다");
	}
	
//	public Girl() {
//		
//	}
	
	public Girl(String name) {
		this.name = name;
	}
}

class GoodGirl extends Girl {
	//goodgirl클래스는 생성자가 없어서 기본 생성자 생성해서 사용
	//girl클래스 상속 받았으므로 기본생성자에 super(부모클래스인 girl의 기본생성자를 호출)가 입력되어 있음
//	public GoodGirl() {
//		super();
//	}
	
	public GoodGirl(String name) {
		super(name);
		this.name = name;
	}
	void show() {
		System.out.println(this.name+ "는 자바를 잘 안다");
	}
}

class BestGirl extends GoodGirl{
	
	public BestGirl(String name) {
		super(name);
		this.name = name;
	}
	void show() {
		System.out.println(this.name+ "는 자바를 무지하게 잘 안다");
	}
}
