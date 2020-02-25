package javaReview;

public class Television { 
	//Ŭ�������� �޼����� ������ �Ұ���(�ݵ�� �޼��� ������ �����ؾ� ��)
	//Ŭ���� ȥ�ڽ��� �ΰ����ؼ� �ݵ�� �ν��Ͻ�ȭ�ؼ� ��ü�� ���� �� ����
	String name = "";
	boolean power =false;
	int channel= 0;
	int volume=0;
	private final int maxChannel = 100;
	private final int minVolume = 0;
	private final int maxVolume = 30;
	//Ŭ������ ������(�ش� Ŭ���� ��������� �ʱ�ȭ)
	public Television(String name) {
		this.name =name;
		power =false;
		channel = 0;
		volume = 0;
	}
	public void powerOn() {
		System.out.println(name +"���� on");
	}
	public void powerOff() {
		System.out.println(name +"���� off");
	}
	public void channelUp() {
		channel++;
		if (channel > maxChannel) {
			channel =0;
		}
		System.out.println(name +"ä����" +channel+"�� ����");
	}
	public void channelDown() {
		channel--;
		if (channel < 0) {
			channel =maxChannel;
		}
		System.out.println(name +"ä����" +channel+"�� ����");
	}
	public void volumeUp() {
		volume++;
		if (volume > maxVolume) {
			volume = maxVolume;
		}
		System.out.println(name +"����" +volume+"�� ����");
	}
	public void volumeDown() {
		volume--;
		if (volume < minVolume) {
			volume = minVolume;
		}
		System.out.println(name +"����" +volume+"�� ����");
	}	
}
