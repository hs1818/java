package chap11;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//que�������̽��� linkedlist�� ����
		Queue<String> q = new LinkedList<>();
		
//		q.remove(); //���� ������ ����
		System.out.println(q.poll()); //poll ����
		q.offer("���");
		System.out.println("�ٳ����� �߰��߳���?"+ q.offer("�ٳ���"));
		
		try {
			q.add("ü��"); //add�� ����ϸ� ���ܹ߻��Ҽ� ����(�����߻� �� ����ó�� �ʿ�)
		}catch(IllegalStateException e) {
		}
		
		System.out.println("��� ����: " + q.peek());
		
		String head = null;
		try {
			head = q.remove();
			System.out.println(head+ "�����ϱ�");
			System.out.println("���ο� ���: "+q.element());
		}catch(NoSuchElementException e) {
		}
		
		head = q.poll();
		System.out.println(head+ "�����ϱ�");
		System.out.println("���ο� ���: "+ q.peek());
		
		System.out.println("ü���� �����ϰ� �ֳ���?"+ q.contains("ü��"));
		System.out.println("����� �����ϰ� �ֳ���?" +q.contains("���"));
	}

}
