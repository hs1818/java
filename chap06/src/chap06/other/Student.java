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
//		System.out.println("�л�[�̸�: "+name + ", ����: "+ age+ ", �й�: "+ number+ "]");
		return "�л�[�̸�: "+name + ", ����: "+ age+ ", �й�: "+ number+ "]";
	}
}
