package javaReview;

public class MicrowaveOven {
	boolean powerState =false;
	int timer =0;
	public void powerOn() {
		if(powerState) {
			System.out.println("이미 전원 on");
		}
		else {
			powerState =true;
			System.out.println("전원 on");
		}
	}
	
	public void powerOff() {
		if(!powerState) {
			System.out.println("이미 전원 꺼짐");
		}
		else {
			powerState =true;
			System.out.println("전원 off");
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
			System.out.println(timer+ "초만큼 작동");
		}
		else {
			System.out.println("시간설정안됨");
		}
	}
}
