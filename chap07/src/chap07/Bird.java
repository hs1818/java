package chap07;

public class Bird implements Countable{
	String name;
	static int counts =2;
	public Bird(String name) {
		this.name = name;
	}
	
	public void count() {
		System.out.println(name+"��"+Bird.counts+ "���� �ִ�");
	}
	
	void fly() {
		System.out.println(Bird.counts+"���� "+name+"�� ���ư���");
	}
}
