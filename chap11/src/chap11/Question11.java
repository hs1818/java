package chap11;
import java.util.ArrayList;
import java.util.List;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("갈매기");
		list.add("나비");
		list.add("다람쥐");
		list.add("라마");
		
		for(String s :list) {
			if(s.length() ==2) {
				System.out.println(s);
			}
		}
	}

}
