package chap01;

public class CaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ÿ�� ��ȯ: ���� �ٸ� ������ Ÿ���� �����ϱ� ���ؼ� ������ ������ Ÿ������ ������ Ÿ���� ��ȯ�ϴ� ��
		// byte -> int
		// float -> double
		// int => double

		// �ڵ�Ÿ�� ��ȯ: ���� �ٸ� ������ Ÿ���� ���� �� �� ū ������ Ÿ������ �ڵ����� ��ȯ�Ͽ� ������ �����ϴ� ��
//		double d1 = 5 * 3.14; // intŸ�� 5�� doubleŸ�� 3.14�� �����ϸ� �ڵ� Ÿ�Ժ�ȯ�� �߻��Ͽ� 5.0 * 3.14 �� �����
//								// �� ū ������ Ÿ���� �Ǽ��� ��ȯ��
//		double d2 = 1; // intŸ�� 1�� double�� ���� d3�� ���� �� �ڵ�Ÿ�� ��ȯ���� �Ǽ�1.0���� ����
//		// ����Ÿ�� ��ȯ: ���� �ٸ� ������ Ÿ���� ���� �� Ư���� ������ Ÿ������ ����ڰ� ���� ������ Ÿ�� ��ȯ�ϴ� ��
//		// ����
//		// (��ȯ�� ������ Ÿ��) �����Ͱ�;
//		float f = (float) 3.14; // float�� ���� f�� double�� �����Ͱ� 3.14�� ������ �� ��� ������ float������ ��ȯ �� ����
//		byte b = (byte) 300; // int300�� byte b�� ����Ұ� �ϹǷ� byte�� ��ȯ �� ����
//		byte x = (byte) 3.14;
//		double d = (double) 3.14; // double�� ���� d�� float�� ������ ���� double������ ��ȯ�� ����

		byte by = 100;
		System.out.println("byteŸ�� ���� by�� ��:" + by);
		int inta = by; // �ڵ� Ÿ�� ��ȯ
		System.out.println("intŸ�� ���� inta�� ��:" + inta);

		inta = 130;
		System.out.println("intaŸ�� ���� inta�� ��:" + inta);
		by = (byte) 130; // ���� Ÿ�� ��ȯ
		System.out.println("byteŸ�� ���� by�� ��:" + by);

		System.out.println("---------------------");

		int intb = 100;
		System.out.println("intaŸ�� ���� intb�� ��:" + intb);
		double dbb = intb; // �ڵ� Ÿ�� ��ȯ
		System.out.println("double Ÿ�� dbb�� ��:" + dbb);
		intb = (int) dbb; // �����߻��ؼ� ���� Ÿ�� ��ȯ
		System.out.println("intaŸ�� ���� intb�� ��:" + intb);
		intb = (int) 3.14; // ���� Ÿ�� ��ȯ
		System.out.println("intaŸ�� ���� intb�� ��:" + intb);

		System.out.println("---------------------");
		int i;
		double d;
		byte b;

		i = 7 / 4; // ���� ����= �Ҽ��� �ڸ� ����x
		System.out.println(i);
		d = 7 / 4; // �������� �����̹Ƿ� ����� 1, doubleŸ�� ������ ����Ǿ� �ڵ�Ÿ�� ��ȯ 1.0
		System.out.println(d);
		// intŸ�԰� doubleŸ���� �������� intŸ���� �ڵ�Ÿ�� ��ȯ�� ����Ǿ� doubleŸ���� �� 7.0/double 4.0 = 1.75
		d = 7 / (double) 4;
		System.out.println(d);

		i = 300; // int Ÿ�Ժ��� i�� �� 300����, 300�� byteŸ���� �ּҰ� -128�� �ִ밪 127�������������Ƿ� byte������ ��ȯ�Ұ�
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			System.out.println("byteŸ������ ��ȯ�� �� �����ϴ�");
		} else {
			b = (byte) i;
		}

	}

}
