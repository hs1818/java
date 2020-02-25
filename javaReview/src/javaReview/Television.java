package javaReview;

public class Television { 
	//클래스에서 메서드의 실행은 불가능(반드시 메서드 내에서 실행해야 함)
	//클래스 혼자실행 부가능해서 반드시 인스턴스화해서 객체로 생성 후 실행
	String name = "";
	boolean power =false;
	int channel= 0;
	int volume=0;
	private final int maxChannel = 100;
	private final int minVolume = 0;
	private final int maxVolume = 30;
	//클래스의 생성자(해당 클래스 멤버변수를 초기화)
	public Television(String name) {
		this.name =name;
		power =false;
		channel = 0;
		volume = 0;
	}
	public void powerOn() {
		System.out.println(name +"전원 on");
	}
	public void powerOff() {
		System.out.println(name +"전원 off");
	}
	public void channelUp() {
		channel++;
		if (channel > maxChannel) {
			channel =0;
		}
		System.out.println(name +"채널이" +channel+"로 변경");
	}
	public void channelDown() {
		channel--;
		if (channel < 0) {
			channel =maxChannel;
		}
		System.out.println(name +"채널이" +channel+"로 변경");
	}
	public void volumeUp() {
		volume++;
		if (volume > maxVolume) {
			volume = maxVolume;
		}
		System.out.println(name +"볼륨" +volume+"로 변경");
	}
	public void volumeDown() {
		volume--;
		if (volume < minVolume) {
			volume = minVolume;
		}
		System.out.println(name +"볼륨" +volume+"로 변경");
	}	
}
