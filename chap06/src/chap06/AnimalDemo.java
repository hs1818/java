package chap06;

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자식클래스가 부모클래스로 부터 상속 받았을 경우, 자식클래스로 객체 생성 시 부모클래스의 생성자 먼저 실행함
		Mammal ape =new Mammal();
		Mammal lion = new Mammal("사자");
	}

}

//부모클래스
class Animal {
	public Animal(String s) {
		System.out.println("동물 :"+s);
	}
}

//자식클래스
class Mammal extends Animal {
	public Mammal() {
//		super(); //부모클래스 생성자 호출, 그러나 매개변수 없는 기본생성자가 없어서 실행안되니 매개변수 있어야함
		super("원숭이"); 
		System.out.println("포유류: 원숭이");
	}
	
	public Mammal(String s) {
		super(s);
		System.out.println("포유류: "+s);
	}
}


	


