package chap06;

public class PolymorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles = new Vehicle[2]; //�θ�Ŭ���� Ÿ������ ����
		vehicles[0] =new Car(); //���� �ٸ� Ÿ��
		vehicles[1] = new SportsCar();
		
		for(Vehicle v : vehicles) { //for each
			v.whoami(); //�޼��� �������̵��� ���ؼ� �ϳ��� �޼���� �������� �޼��带 ������ ȿ��
		}               //���� ������ whoami��� �޼��带 ���������� ������� �ٸ��� ��µ�
		
//		for(int i =0; i<vehicles.length; i++) {
//			vehicles[i].whoami();
//		}
	}
}

class SportsCar extends Car {
	void whoami() {
		System.out.println("���� ������ �ڵ�����");
	}
}
