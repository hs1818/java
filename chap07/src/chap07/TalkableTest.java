package chap07;

public class TalkableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		speak(new Korean());
		speak(new American());
	}
	
	//�ΰ��� Ŭ������ ����� �θ�Ŭ���� Ȥ���θ� �������̽�, objectŸ��
	static void speak(Talkable t) {
		t.talk();
	}
}
