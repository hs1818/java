package chap06;

public class OverTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v =new Vehicle();
		System.out.println(v.name);
		v.whoami(); //�������̵� �� whoami�� ����
		v.move();
		
		System.out.println("--------------------");
		Car c = new Car();
		System.out.println(c.name);
		c.whoami();
		c.move();
		
		System.out.println("---------------");
		v =c;
		System.out.println(v.name);
		v.whoami();
		v.move();
		
	}

}

class Vehicle {
	String name ="Ż��";
	
	void whoami() {
		System.out.println("���� Ż ���̴�");
	}
	
	//static����ؼ� ���x �������̵� �Ұ�
	static void move() {
		System.out.println("�̵��ϴ�");
	}
}

class Car extends Vehicle {
	String name ="�ڵ���";
	
	//�������̵���
	void whoami() {
		System.out.println("���� �ڵ�����");
	}
	
	static void move() {
		System.out.println("�޸���");
	}
}