package chap07;

public class TV3 implements Control3{
	@Override
	public void ChannelUp() {
		System.out.println("채널번호를 1 up");
	}
	
	@Override
	public void ChannelDown() {
		System.out.println("채널번호를 1 down");
	}
	
	
	@Override
	public void powerOn() {
		System.out.println("tv의전원을 킨다");
	}
	
	@Override 
	public void powerOff() {
		System.out.println("tv의전원을 끈다");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("볼륨 up");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("볼륨 down");
	}
}
