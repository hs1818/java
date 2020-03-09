package chap07;

public class Tree implements Countable {
	String name;
	static int counts = 5;
	public Tree(String name) {
		this.name = name;
	}
	
	public void count() {
		System.out.println(name+"가"+Tree.counts+"그루 있다");
	}
	
	void ripen() {
		System.out.println(name+"에 열매가 잘 익었다");
	}
}
