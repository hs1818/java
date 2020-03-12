package chap11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("다람쥐");
		list.add("개구리");
		list.add("나비");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println();
		
		Collections.sort(list); //전체적인 데이터 받아오고 처리할때 collection사용
		
		//중간에 비어있는이유 : 위에서 다 출력해서 안나옴
		while(iterator.hasNext()) {
			System.out.print(iterator.next() +",\t");
		}
		System.out.println();
		
		iterator = list.iterator(); //반복자 스트림 객체에 list값을 다시 대입
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+ "->\t");
		}
	}

}
