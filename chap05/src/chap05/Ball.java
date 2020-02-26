package chap05;

public class Ball extends Circles{
	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color+ "공이다");
	}
	
	public void findVolume() {
		System.out.println("부피는 4/3 * (n * 반지름*반지름*반지름)이다");
	}
	
	//메서드 오버라이딩 : 부모 클래스로부터 상속받은 메서드 내용을 수정하여 사용
		// 형식은 100퍼 동일해야함, 실행코드부분은 자식클래스에 맞게 수정해서 사용
	
	@Override //어노테이션: 특정기능을 추가하는 효과 (써도되고 안써도되고)
			//사용 시 오버라이딩 규칙과 틀릴경우 오류메시지가 뜸
	public void findArea() {
		findRadius();
		super.findArea(); 	//super사용
		System.out.println("넓이는 (4 * 반지름* 반지름)이다");
	}
}
