package chap06.other;

public class Student extends Person{
	protected int number;

	public Student(String name, int age, int number) {
		super(name,age);
		this.number =number;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String show() {
//		System.out.println("학생[이름: "+name + ", 나이: "+ age+ ", 학번: "+ number+ "]");
		return "학생[이름: "+name + ", 나이: "+ age+ ", 학번: "+ number+ "]";
	}
}
