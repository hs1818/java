package javaReview;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 c1= new Car2("red");
		Car2 c2= new Car2("blue");
		Car2 c3= new Car2("RED");
		System.out.printf("�ڵ��� ��: %d, ������ �ڵ��� �� : %d", Car2.getNumOfCar(), Car2.getNumOfRedCar());
				//Ŭ���� �� �״�� ��� = �ش� ��������� static
	}

}

class Car2 {
	String color; //���� ���� ����
	private static int numOfCar =0; //�� ��ü���� ��� �����ϴ� ����, ������ �� ���庯��
	private static int numOfRedCar =0;// ����red���� �� ���庯��
	
	public static int getNumOfCar() {
		return numOfCar; //ĸ��ȭ �� ��ü���� ���� �������� �޼���
	}
	
	public static int getNumOfRedCar() { //red������ ��������
		return numOfRedCar;
	}
	
	public Car2(String color) { //Ŭ���� Car2�� ������: ��ȯŸ�� �Էºκо���
		this.color = color;
		numOfCar++; //�� ���� �� ����
		
		if(color =="red"|| color == "RED" ) {
			numOfRedCar++; //red�� �� ����
		}
	}
}