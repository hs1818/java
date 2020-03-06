package chap06.other;

public class ForeignStudent extends Student{
	String nationality;

	public ForeignStudent(String name, int age, int number, String nationality) {
		super(name, age, number);
		this.nationality =nationality;
	}
	
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public String show() {
//		System.out.println("외국학생[이름: "+name + ", 나이: "+ age+ ", 학번: "+ number+ ", 국적: "+ nationality+ "]");
		return "외국학생[이름: "+name + ", 나이: "+ age+ ", 학번: "+ number+ ", 국적: "+ nationality+ "]";
	}
}
