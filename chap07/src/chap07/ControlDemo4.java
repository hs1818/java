package chap07;

public class ControlDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV4 tv = new TV4();
		Computer4 com = new Computer4();
		
		tv.turnOn(); //remotecontrollable����
		tv.turnOff();//remotecontrollable����
		tv.repair(); //controllable2 ����Ʈ �޼��� ��ӹ޾� ����/�������̵� ����/�������̽����� �޼��� ��밡��(default�޼����)
					//static�� �ƴ϶� (�������̽���.�޼����) ���ٺҰ�(�ݵ�� ��ӹ޾� ���) 
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable2.reset(); //static�̶� (�������̽���.�޼����)
		
		//tv.reset();  reset�� �����޼���� (�������̽���.�޼����)�� ���ٰ���
		//com.reset();
		//Controllable2.repair(); repair�� ����Ʈ�޼���� ����� ���ؼ��� ������ ����
		
		//�������̽��� ��������ڸ� private�� ���x
	}

}
