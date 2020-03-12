package chap11;

import java.util.Map;
import java.util.HashMap;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map 인터페이스타입 
		//구현하는 클래스 hashmap
		Map<String, String> dic = new HashMap<>();
		dic.put("head", "대가빠리");
		dic.put("teacher", "쌤");
		dic.put("cat", "꼬네이");
		dic.put("aunt", "아지매");
		dic.put("noodle", "국시");
		dic.put("child", "얼라");
		
		for(String key : dic.keySet()) {
			System.out.printf("%s=%s   ", key, dic.get(key));
		}
		
	}

}
