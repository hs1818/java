package chap07;

//사용자가 생성한 클래스 객체를 비교하기 위해 comparable인터페이스를 상속받아 구현
//compareTo()메서드 구현해야함
public class Book implements Comparable{
	int price;
	
	public Book(int price) {
		this.price = price;
	}
	
	void show() {
		System.out.println("Book [price ="+price+"]");
	}
	
	public int compareTo(Object o) {
		Book b =(Book) o;
	
		if(this.price <b.price) {
			return 1;
		}
		else if(this.price == b.price) {
			return 0;
		}
		else {
			return -1;
		}
	}
}
