package chap07;

public class CountableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Countable[] m = {new Bird("���ٱ�"), new Bird("������"), //�θ��������̽� m
				new Tree("�������"), new Tree("�㳪��") };
		
		for(Countable e :m) {
			e.count();
		}
		
		for(int i =0; i<m.length; i++) {
			if(m[i] instanceof Bird) {
				Bird b = (Bird)m[i]; //��������
				b.fly();
			}
			else {
				Tree b = (Tree)m[i];
				b.ripen();
			}
			
		}
		
		
		}
	}


