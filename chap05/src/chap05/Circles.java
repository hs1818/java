package chap05;

public class Circles {
	private void secret() { //클래스 내부에서 동작
		System.out.println("비밀이다");
	}
	protected void findRadius() { //circle클래스를 상속받은 클래스까지 사용가능(부모+자식)
		System.out.println("반지름이 10.0센티미터");
	}
	
	public void findArea() {
		System.out.println("넓이는 (n * 반지름* 반지름)이다");
	}
}
