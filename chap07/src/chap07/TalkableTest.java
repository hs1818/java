package chap07;

public class TalkableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		speak(new Korean());
		speak(new American());
	}
	
	//두개의 클래스의 모두의 부모클래스 혹은부모 인터페이스, object타입
	static void speak(Talkable t) {
		t.talk();
	}
}
