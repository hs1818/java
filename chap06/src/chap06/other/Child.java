package chap06.other;

public class Child extends Parent{
	String name = "사도세자";
	
	public Child() {
		super();
	}
	
	void print() {
		System.out.print("나는"+ name+ "이다");
	}
}
