package chap06;

public class UpcastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =new Person();
		Student s =new Student();
		
		p.name ="ȫ�浿";
		System.out.println(p.name);
		p.whoami();
		
		System.out.println("----------------");
		s.name = "�Ӳ���";
		s.number =1;
		System.out.println(s.name);
		System.out.println(s.number);
		s.whoami();
		s.work();
		
		System.out.println("----------------");
		p=s; //�θ�Ŭ������ �ڵ�Ÿ�Ժ�ȯ
//		p.number =1; //personŬ������ ������ �ִ� ����� ��밡��
//		p.work();
		System.out.println(p.name);
		p.whoami();
		
		
		System.out.println("----------------");
//		Student s2;
//		Person p2 = new Person();
//		s2 = p2; �����߻� -> �θ�Ŭ������ �ڽ�Ŭ������ ��ȯ�� �Ұ�����
		
		System.out.println("----------------");
		//�ٽ� �ڽ� Ÿ������ ����
		Student s1;
		s1 = (Student)p; //����Ÿ�� ��ȯ
		System.out.println(s1.name);
		System.out.println(s1.number);
		s1.whoami();
		s1.work();
	}

}
