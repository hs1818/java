package chap09;
import java.text.*;
import java.util.*;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date(); //���� �ð��� �޾ƿ�
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss:SSS a z");
		System.out.println(sdf1.format(d)); //ȭ����� SimpleDateFormat���� ǥ��
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			d =sdf2.parse("2023-02-28"); //Date Ÿ�� d�� ����
		} catch (ParseException e) {
			System.out.println("������ �߻��߽��ϴ�");
		}
		System.out.println(sdf1.format(d));
		
	}

}
