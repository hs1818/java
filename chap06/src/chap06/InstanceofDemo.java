package chap06;

public class InstanceofDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Person p = new Person();
		//s�� person�� ���ϱ� ������ person�� ��ü(�ڵ�Ÿ�Ժ�ȯ)
		System.out.println(s instanceof Person); 
		//s�� student�� ��ü
		System.out.println(s instanceof Student);
		System.out.println(p instanceof Student);
		System.out.println(p instanceof Person); 
		
		downcast(s);
	}
	
	static void downcast(Person p) {
		if(p instanceof Student) {
			Student s = (Student)p; //����Ÿ�Ժ�ȯ
			System.out.println("OK, ���� Ÿ�� ��ȯ");
		}
	}

}
