package chap06;

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڽ�Ŭ������ �θ�Ŭ������ ���� ��� �޾��� ���, �ڽ�Ŭ������ ��ü ���� �� �θ�Ŭ������ ������ ���� ������
		Mammal ape =new Mammal();
		Mammal lion = new Mammal("����");
	}

}

//�θ�Ŭ����
class Animal {
	public Animal(String s) {
		System.out.println("���� :"+s);
	}
}

//�ڽ�Ŭ����
class Mammal extends Animal {
	public Mammal() {
//		super(); //�θ�Ŭ���� ������ ȣ��, �׷��� �Ű����� ���� �⺻�����ڰ� ��� ����ȵǴ� �Ű����� �־����
		super("������"); 
		System.out.println("������: ������");
	}
	
	public Mammal(String s) {
		super(s);
		System.out.println("������: "+s);
	}
}


	


