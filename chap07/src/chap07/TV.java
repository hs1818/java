package chap07;
//extends: �������̽�, Ŭ������ ��ӹ޴� Ű����(interface���� ��Ӱ���)
//implements : �������̽��� ������ �� �޴� Ű����
public class TV implements Controllable{
	//�������̽��� ��ӹ޾� ������ �޼���
	@Override
	public void turnOn() {
		System.out.println("TV�� �Ҵ�");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV�� ����");
	}
}

class Computer implements Controllable {
	@Override
	public void turnOn() {
		System.out.println("computer�� �Ҵ�");
	}
	
	@Override
	public void turnOff() {
		System.out.println("computer�� ����");
	}
}
