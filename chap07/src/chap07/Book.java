package chap07;

//����ڰ� ������ Ŭ���� ��ü�� ���ϱ� ���� comparable�������̽��� ��ӹ޾� ����
//compareTo()�޼��� �����ؾ���
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
