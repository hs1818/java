package chap06;

public class Two {
	void print() {
		One o =new One(); //���� ��Ű�������� oneŬ������ ��ü�� �ν��Ͻ�ȭ
//		System.out.println(o.secret);  //private
		System.out.println(o.roommate); //default
		System.out.println(o.child); //protected
		System.out.println(o.anybody); //public
	}
}
