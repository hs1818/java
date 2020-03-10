package chap09;

public class StringBuilderDemo {
	public static void main(String[]args) {
		String s = new String("hi"); 
		System.out.println(s.hashCode()); //해쉬코드: 객체의 id같은거
		s = s+"!";
		//변경된 문자열 s의 hashcode출력
		System.out.println(s.hashCode()); //값 추가하면 메모리 주소 변경됨
		
		StringBuilder sb = new StringBuilder("hi");
		System.out.println(sb.hashCode()); //StringBuilder타입의 문자열 sb의 해시코드 출력
		sb = sb.append("!");
		System.out.println(sb.hashCode()); //해시코드 그대로(변경할게 많으면 builder사용추천, 그냥 string써도됨)
		
		//원래는 sb = sb.replace(0,2,"Good bye");
		//sb = sb.insert(0,"Java,");
		System.out.println(sb.replace(0, 2, "Good bye").insert(0, "Java,"));
		System.out.println(sb.hashCode()); 
	}
}
