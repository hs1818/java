package chap11;

import java.util.Map;
import java.util.HashMap;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map �������̽�Ÿ�� 
		//�����ϴ� Ŭ���� hashmap
		Map<String, String> dic = new HashMap<>();
		dic.put("head", "�밡����");
		dic.put("teacher", "��");
		dic.put("cat", "������");
		dic.put("aunt", "������");
		dic.put("noodle", "����");
		dic.put("child", "���");
		
		for(String key : dic.keySet()) {
			System.out.printf("%s=%s   ", key, dic.get(key));
		}
		
	}

}
