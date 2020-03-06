package chap06.other;

public class Person {
	protected String name;
	protected int age;

	public Person(String name, int age) {
		this.name =name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String show() {
//		System.out.println("사람[이름: "+name + ", 나이: "+ age+"]");
		return "사람[이름: "+name + ", 나이: "+ age+"]";
	}
	
	
}
