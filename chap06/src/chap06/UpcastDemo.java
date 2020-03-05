package chap06;

public class UpcastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =new Person();
		Student s =new Student();
		
		p.name ="홍길동";
		System.out.println(p.name);
		p.whoami();
		
		System.out.println("----------------");
		s.name = "임꺽정";
		s.number =1;
		System.out.println(s.name);
		System.out.println(s.number);
		s.whoami();
		s.work();
		
		System.out.println("----------------");
		p=s; //부모클래스로 자동타입변환
//		p.number =1; //person클래스가 가지고 있는 멤버만 사용가능
//		p.work();
		System.out.println(p.name);
		p.whoami();
		
		
		System.out.println("----------------");
//		Student s2;
//		Person p2 = new Person();
//		s2 = p2; 오류발생 -> 부모클래스는 자식클래스로 변환이 불가능함
		
		System.out.println("----------------");
		//다시 자식 타입으로 변경
		Student s1;
		s1 = (Student)p; //강제타입 변환
		System.out.println(s1.name);
		System.out.println(s1.number);
		s1.whoami();
		s1.work();
	}

}
