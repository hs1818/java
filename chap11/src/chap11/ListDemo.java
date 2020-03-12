package chap11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]names1 = {"사슴", "호랑이", "바다표범","곰"};
		
		List<String> list = Arrays.asList(names1);
		list.set(1, "앵무새");
		for(String s :list) {
			System.out.print(s+ "\t");
		}
		System.out.println();
		
		list.sort((x,y) -> x.length() - y.length());
		String[] names2 = list.toArray(new String[list.size()]);
		for(int i =0; i<names2.length; i++) {
			System.out.print(names2[i] + "\t");
		}
		System.out.println();
		
		System.out.println("---------------------List생성");
		List<String> list1 = new ArrayList<String>();
		System.out.println(list1.size()); // 0
		
		list1.add("길동");
		list1.add("순신");
		System.out.println(list1.size()); //2
		
		for(int i =0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		list1.remove(0);
		System.out.println("--------------삭제 후");
		
		for(String s: list1) {
			System.out.println(s);
		}
		
		System.out.println("--------------수정 후");
		list1.set(0, "룰루"); //list1데이터 index 0번 수정
		
		System.out.println(list1.get(0));
		System.out.println(list1.size());
		
	}

}
