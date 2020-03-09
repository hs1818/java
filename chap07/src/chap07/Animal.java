package chap07;

public interface Animal {
	void sound();
}

class Dog implements Animal{
	public void sound() {
		System.out.println("¸Û¸Û");
	}
}

class Cuckoo implements Animal{
	public void sound() {
		System.out.println("»µ²Ú");
	}
}
