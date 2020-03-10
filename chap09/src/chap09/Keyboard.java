package chap09;

//��� Ŭ������ �⺻������ ObjectŬ������ ��ӹ޾� �����(extend�Ƚᵵ)
public class Keyboard {
	String name;
	
	public Keyboard(String name) {
		this.name =name;
	}
	
	//objectŬ������ �����ϴ� �޼��� �� �ϳ� equals
	//�������̵��ؼ� ��ɺ���
	public boolean equals(Object obj) {  
		if (obj instanceof Keyboard) {
			Keyboard k = (Keyboard) obj; //�ٽ� keyboardŸ������ ���� Ÿ�� ��ȯ 
			
			//��ü������� name�� �޾ƿ� �Ű����� name�� ������ ��
			if(this.name.equals(k.name)) { //�̺κ��� microsoft�� ������ ���Ϸ��� �����
				return true;
			}
		}
		return false;
	}
	
	//toString(): �ش� ����� ������ ���ڿ��� ����ϴ� �޼���
	//���⼭�� �������̵��ؼ� �����(Ű�����Դϴ�)
	public String toString() {
		return "Ű�����Դϴ�";
	}
}


class Mouse{
	String name;
	
	public Mouse(String name) {
		this.name = name;
	}
}
