package chap07;

public class Concrete extends Abstract{
	int j;
	
	public Concrete(int i, int j) {
		//부모클래스에 사용자가 생성한 생성자가 있을 경우 자식클래스 생성자에서 부모클래스 생성자를 호출하는 부분이 필요
		super(i); 
		this.j = j;
	}

	void show() {
		System.out.println("i =" +i+", j = "+j);
	}
}
