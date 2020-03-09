package chap07;

public class Bird implements Countable{
	String name;
	static int counts =2;
	public Bird(String name) {
		this.name = name;
	}
	
	public void count() {
		System.out.println(name+"가"+Bird.counts+ "마리 있다");
	}
	
	void fly() {
		System.out.println(Bird.counts+"마리 "+name+"가 날아간다");
	}
}
