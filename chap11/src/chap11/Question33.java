package chap11;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new Hashtable<>();
		map.put("�迭��", 80);
		map.put("�ְ��", 90);
		map.put("����", 95);
		map.put("���ڹ�", 88);
		
		Scanner in = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���: ");
		String id = in.nextLine();
		
		//map�������̽����� countainskey�� �ش� map��ü�� ������ key�ִ��� �˻�
		if(map.containsKey(id)) {
			System.out.println(map.get(id));
		}
		else {
			System.out.println("����ڰ� �˻����� �ʽ��ϴ�");
		}
	}

}
