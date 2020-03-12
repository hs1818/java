package chap11;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new Hashtable<>();
		map.put("김열공", 80);
		map.put("최고봉", 90);
		map.put("우등생", 95);
		map.put("나자바", 88);
		
		Scanner in = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String id = in.nextLine();
		
		//map인터페이스에서 countainskey는 해당 map객체에 지정한 key있는지 검색
		if(map.containsKey(id)) {
			System.out.println(map.get(id));
		}
		else {
			System.out.println("사용자가 검색되지 않습니다");
		}
	}

}
