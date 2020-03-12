package chap11;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//que인터페이스고 linkedlist가 구현
		Queue<String> q = new LinkedList<>();
		
//		q.remove(); //원소 없으니 오류
		System.out.println(q.poll()); //poll 삭제
		q.offer("사과");
		System.out.println("바나나를 추가했나요?"+ q.offer("바나나"));
		
		try {
			q.add("체리"); //add를 사용하면 예외발생할수 있음(오류발생 시 예외처리 필요)
		}catch(IllegalStateException e) {
		}
		
		System.out.println("헤드 힐끔: " + q.peek());
		
		String head = null;
		try {
			head = q.remove();
			System.out.println(head+ "제거하기");
			System.out.println("새로운 헤드: "+q.element());
		}catch(NoSuchElementException e) {
		}
		
		head = q.poll();
		System.out.println(head+ "제거하기");
		System.out.println("새로운 헤드: "+ q.peek());
		
		System.out.println("체리를 포합하고 있나요?"+ q.contains("체리"));
		System.out.println("사과를 포함하고 있나요?" +q.contains("사과"));
	}

}
