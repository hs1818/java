package javaReview;

public class MicrowaveOven {
	boolean powerState =false;
	int timer =0;
	public void powerOn() {
		if(powerState) {
			System.out.println("�̹� ���� on");
		}
		else {
			powerState =true;
			System.out.println("���� on");
		}
	}
	
	public void powerOff() {
		if(!powerState) {
			System.out.println("�̹� ���� ����");
		}
		else {
			powerState =true;
			System.out.println("���� off");
		}
	}
	
	public void setTime10sec() {
		timer += 10;
	}
	
	public void setTime1min() {
		timer += 60;
	}
	public void startOven() {
		if(timer>0) {
			System.out.println(timer+ "�ʸ�ŭ �۵�");
		}
		else {
			System.out.println("�ð������ȵ�");
		}
	}
}
