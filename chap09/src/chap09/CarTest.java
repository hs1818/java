package chap09;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("�׷���");  //��ü�� �����Ǹ� hashcode�� ������(��ü���� �� �ٸ�)
		Car yourCar = new Car("�׷���");
		
		//p 328
		//1�� ���� objectŬ������ ������ equals�� �� 
		System.out.println(myCar.equals(yourCar)); //���� ���� false�� hashcode �ٸ�
		System.out.println(myCar.toString(yourCar));
		
//		if(myCar instanceof Car) {
//			System.out.println("�� �ڵ����� ["+ myCar+"], �� �ڵ����� ["+yourCar+"]�� ���� ����");
//		}
//		else if(yourCar instanceof Car) {
//			System.out.println("�� �ڵ����� ["+ myCar+"], �� �ڵ����� ["+yourCar+"]�� ���� ����");
//		}
//		else {
//			System.out.println("�� �ڵ����� ["+ myCar+"], �� �ڵ����� ["+yourCar+"]�� ���� �ٸ���");
//		}
		
	}

}
