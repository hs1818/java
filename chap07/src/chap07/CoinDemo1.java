package chap07;

public class CoinDemo1 {
	public static void main(String[] args) {
		//Coin.DIME�� �������̽��� ������ �ִ� ����̹Ƿ� staticŰ���尡 ���Ǿ� �־� ��ü�������� (�������̽���.�����) ���·� ��밡��
		//��ӹ��� �ʾ����� �������̽��� �տ� ����ߴ�
		System.out.println("Dime��"+Coin.DIME + "��Ʈ�Դϴ�");
	}
}

//�������̽����� ����� �� �ִ� ����� ���, �߻�޼���, default�޼���, static�޼��常 ��� ����
//�������̽��� ����� int PENNY =1; ��밡�� ������ final static Ű���尡 �����Ǿ� ����(������ �� �ڵ����� �߰�)
interface Coin {
	final static int PENNY =1;
	int NICKEL =5;
	int DIME =10;
	int QUARTER =25;
}
