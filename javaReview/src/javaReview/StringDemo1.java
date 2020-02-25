package javaReview;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hi, Java!";
		String s2 = "Hi, Java!";
		String s3 = new String("Hi, Java!");
		String s4 = new String("Hi, Java!");
		
		// 문자열에서 ==는 문자열 비교x 문자열 객체가 동일한지 확인
		// 실제 문자열 자체를 비교하려면 string클래스에서 제공하는 equals메서드를 이용해서 확인
		System.out.println("s1==s2 -> "+(s1==s2));
		System.out.println("s1==s3 -> "+(s1==s3));
		System.out.println("s3==s4 -> "+(s3==s4));
		s1 =s3;
		System.out.println("s1==s3 -> "+(s1==s3));
		System.out.println("s3.equals(s4) ->"+ s3.equals(s4));
	}

}
