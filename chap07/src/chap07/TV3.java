package chap07;

public class TV3 implements Control3{
	@Override
	public void ChannelUp() {
		System.out.println("ä�ι�ȣ�� 1 up");
	}
	
	@Override
	public void ChannelDown() {
		System.out.println("ä�ι�ȣ�� 1 down");
	}
	
	
	@Override
	public void powerOn() {
		System.out.println("tv�������� Ų��");
	}
	
	@Override 
	public void powerOff() {
		System.out.println("tv�������� ����");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("���� up");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("���� down");
	}
}
