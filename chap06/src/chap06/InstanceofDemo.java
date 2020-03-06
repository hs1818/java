package chap06;

public class InstanceofDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Person p = new Person();
		//s는 person에 속하기 떄문에 person의 객체(자동타입변환)
		System.out.println(s instanceof Person); 
		//s는 student의 객체
		System.out.println(s instanceof Student);
		System.out.println(p instanceof Student);
		System.out.println(p instanceof Person); 
		
		downcast(s);
	}
	
	static void downcast(Person p) {
		if(p instanceof Student) {
			Student s = (Student)p; //강제타입변환
			System.out.println("OK, 하향 타입 변환");
		}
	}

}
