package chap01;

public class CharBoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char�� ���� 1�ڸ� ǥ���ϱ� ���� ������ Ÿ��
		// ���ڸ� ǥ���ϱ� ���� ��ȣ ''�� �����(""�� ���ڿ��� ǥ���ϱ� ���ؼ� �����)
		// ���ڴ� �����ڵ带 ������(UTF-8����)
		char ga1 = '��';// ���ں��� g1�� �ѱ� �� ����
		char ga2 = '\uac00'; // ���ں���g2�� �����ڵ�� ���� ����

		boolean cham = true; // �������� booleanŸ�� ���
		boolean geojit = false;

		System.out.println(ga1);
		System.out.println(ga2);
		System.out.println(cham + "�� �ƴϸ�" + geojit + "�Դϴ�");

		// �⺻������ �ڹ��� ���� ���� �� ����� �ڹٽ�ũ��Ʈ�� �������� �� ���� ������
		// �ٸ����� ���� ���� �� ������ Ÿ���� �Է��Ѵٴ� ��

		// ���
		// ������ ���� �����͸� �����ϴ� �޸� ���������� �ѹ� ���� �� �� �̻� �����͸� ������ �� ���� ����
		// ���α׷� �����߿� �����͸� ������ �� ���� ����
		// ��� ����� ���ÿ� ���� �Է��ؾ���
		// ���������� ����� �̸��� ���� �빮�ڸ� ���
		// ����
		// final ������ Ÿ�� ����� = �����;
//		final double PI = 3.14; // ��� ����
//		final double PI2; // �� ��� ����
//		PI2 = 3.14; // ��� �� ���� ����
//		PI2 = 3.1428; // ���� �߻�, ����� �� ����õ� �ȵ� finalŰ����� �ݵ�� �����ؾ���
	}

}