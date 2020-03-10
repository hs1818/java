package chap09;
import java.text.*;
import java.util.*;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date(); //현재 시간을 받아옴
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss:SSS a z");
		System.out.println(sdf1.format(d)); //화면출력 SimpleDateFormat으로 표현
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			d =sdf2.parse("2023-02-28"); //Date 타입 d에 저장
		} catch (ParseException e) {
			System.out.println("오류가 발생했습니다");
		}
		System.out.println(sdf1.format(d));
		
	}

}
