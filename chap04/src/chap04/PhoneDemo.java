package chap04;

//����Ŭ����, ����Ŭ������ PhoneDemo�� �����ϱ� ���ؼ� �ʿ��� Ŭ����
//���赵�̱⶧���� ����� �ʿ��� ()�� ����
class Phone {
	String model; //�𵨸� ���庯��
	int value; //���� ���庯��
	
	void print() { //void ��ȯ�� ����
		System.out.println(value+ "�� ��¥�� " + model + " ����Ʈ��");
	}
}
//����Ŭ����: �������� �����ϴ� Ŭ�������� ���������ڸ� public���� ���
public class PhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myPhone = new Phone(); //Ŭ���� phone�� newŰ���带 ���ؼ� �ν��Ͻ�(��ü)ȭ ��
		myPhone.model = "������S20"; //model ������� ���� ����(������)
		myPhone.value = 100;
		myPhone.print(); //print()��� �޼��带 ������ ����
		
		Phone yourPhone = new Phone();
		yourPhone.model ="G6";
		yourPhone.value =85;
		yourPhone.print();
	}

}
