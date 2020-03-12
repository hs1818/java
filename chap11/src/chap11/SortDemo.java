package chap11;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]s = {"나는", "조국", "대한민국을", "싫어합니다"};
		List<String> list = Arrays.asList(s);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
	}

}
