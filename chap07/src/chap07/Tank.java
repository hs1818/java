package chap07;

public class Tank extends Unit{
	public Tank(String name, int hp) {
		super(name,hp);
	}
	
//	public void drive() {
//		System.out.println(name+"지정한 장소로 이동합니다");
//	}
	
	public void move() {
		System.out.println(name+"이 시즈를 풀고 지정한 장소로 이동합니다");
	}
}
