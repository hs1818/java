package chap06.other;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------��1");
		Calculator cal = new Calculator(10,3);
		cal.sum();
		cal.sub();
		cal.multi();
		cal.div();
		
		System.out.println("--------------------��2");
		Calculator2 ca = new Calculator2(20,3);
		ca.sum();
		ca.sub();
		ca.multi();
		ca.div();
	}

}

//��1) CalculatorŬ������ �����ϰ� ������� intŸ�� num1, num2����, ��� �޼��� sum, sub, multi, div�����ϼ���
	//�� �޼��带 ����Ͽ� �Էµ� 2���� ���ڸ� �����ϴ� ���α׷��� �ۼ��ϼ���
	//�����ڸ� ���ؼ� ���� 2���� �Է¹���
	//2���� ��� ������ ������ �� �ִ� getter setter ����

//��2) ��1�� CalculatorŬ������ ������ ������ Ŭ���� Calculator2�� ���� �����ϼ���
	//Ŭ���� Numbers��  ������� num1, num2�� ������ ����
	//Ŭ���� cal1�� ����޼��� sum�� ������ ���� / Ŭ���� Numbers�� ��ӹ���
	//Ŭ���� cal2�� ����޼��� sub�� ������ ���� / Ŭ���� Cal1�� ��ӹ���
	//Ŭ���� cal3�� ����޼��� multi�� ������ ���� / Ŭ���� Cal2�� ��ӹ���
	//Ŭ���� Calculator2�� ����޼��� div�� ������ ���� / Ŭ���� Cal3�� ��ӹ���
	//���� 1ó�� �����ϱ�