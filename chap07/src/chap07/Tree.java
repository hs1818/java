package chap07;

public class Tree implements Countable {
	String name;
	static int counts = 5;
	public Tree(String name) {
		this.name = name;
	}
	
	public void count() {
		System.out.println(name+"��"+Tree.counts+"�׷� �ִ�");
	}
	
	void ripen() {
		System.out.println(name+"�� ���Ű� �� �;���");
	}
}
