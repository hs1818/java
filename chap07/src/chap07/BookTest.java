package chap07;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Book []books = {new Book(15000), new Book(50000), new Book(20000)};
		
		Book[] books = new Book[3];
		books[0] = new Book(15000);
		books[1] = new Book(50000);
		books[2] = new Book(20000);
		
		System.out.println("정렬전");
		for(Book b:books) {
			b.show();
		}
		
		Arrays.sort(books);
		
		System.out.println("정렬후");
		for(Book b: books) {
			b.show();
		}
		

		
	}
}

