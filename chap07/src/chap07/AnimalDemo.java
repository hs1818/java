package chap07;

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d =new Dog();
		Cuckoo c = new Cuckoo();
		
//		d.sound();
//		c.sound();
		makeSound(d);
		makeSound(c);
		
		}
	//�������̽� animalŸ������ �Ű������� ����
	//�Ű������� ���� �����ʹ� Ŭ���� Dog, Cuckoo�� ��ü
	static void makeSound(Animal a) { 
		a.sound();
	}
	
}
