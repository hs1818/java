package chap07;

//interface ���߻��
public class TV2 implements Control1,Control2{
	@Override
	public void powerOn() {
		System.out.println("tv�������� Ų��");
	}
	
	@Override //�����Ϸ��� �ش� �޼��带 �������̵��ϴ��� üũ��
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
//interface ���ϻ��
class Computer2 implements Control1{
	@Override
	public void powerOn() {
		System.out.println("computer������ on");
	}
	
	@Override
	public void powerOff() {
		System.out.println("computer������ off");
	}
}


