package chap07;

abstract public class Shape { //�߻�Ŭ����: �߻�޼��尡 1���̻� �����ϴ� Ŭ����(��ü���� �ȵǰ� �ݵ�� ��ӹ޾� ����ؾ���)
	double pi =3.14;
	
	abstract public void draw(); //�߻�޼���: �޼�������� ����� ���� �޼���(�����ڵ� �κо���)
	
	public double findArea() {
		return 0.0;
	}
}
