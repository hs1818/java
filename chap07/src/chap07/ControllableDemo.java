package chap07;

public class ControllableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Controllable2[] controllable = {new TV4(), new Computer4()};
		
//		TV4 tv = new TV4();
//		Computer4 com = new Computer4();
//		Controllable2[] controllable = new Controllable2[2];
//		controllable[0] =tv;
//		controllable[1] =com;
		
		//�������̽�Ÿ������ ��ȯ�� ������ / TV4Ŭ������ ������ ����� ���������� controllable2 �������̽� ����� ������
//		Controllable2 c1 = tv; 
//		Controllable2 c2 = com;
		
		for(Controllable2 c : controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
		}
		Controllable2.reset();
	}

}
