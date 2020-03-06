package chap07;

public class Marine extends Unit{
	
	public Marine(String name, int hp) {
		super(name,hp);
	}
	
	//마린이 이동을 위해 사용하는 메서드
//	public void run() {
//		System.out.println(name+"지정한 장소로 이동합니다");
//	}
	
	public void move() {
		System.out.println(name+"이 스팀팩 쓰고 지정한 장소로 이동합니다");
	}
}
