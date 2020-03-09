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
	//인터페이스 animal타입으로 매개변수를 받음
	//매개변수에 들어가는 데이터는 클래스 Dog, Cuckoo의 객체
	static void makeSound(Animal a) { 
		a.sound();
	}
	
}
