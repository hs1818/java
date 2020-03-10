package chap09;

import java.text.MessageFormat;

public class MessageFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String java = "java";
		int version = 8;
		
//		String str = "language :" +java + "\nversion:" +version; //원래방식
		//무조건 0부터 시작
		String s =MessageFormat.format("language: {1}\nversion: {0}", version, java);
		System.out.println(s);
		
		Object[]data = {java, version};
		
		MessageFormat f = new MessageFormat("language : {0}\nversion : {1}");
		System.out.println(f.format(data));
		
	}

}
