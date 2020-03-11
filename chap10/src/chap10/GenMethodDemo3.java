package chap10;
class Ticket implements Comparable {
	int no;
	public Ticket(int no) {
		this.no = no;
	}
	public int compareTo(Object o) {
		Ticket t =(Ticket) o;
		int result =0;
		
		if(no<t.no) {
			result =-1;
		}
		else if(no>t.no) {
			result =1;
		}
		else {
			result =0;
		}
		return result;
	}
}
public class GenMethodDemo3 {
	
	public static <T extends Comparable> int countGT(T[]a, T elem) {
		int count =0;
		for(T e :a) {
			if (e.compareTo(elem) >0) {
				++count;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket[]a = {new Ticket(5), new Ticket(3), new Ticket(10), 
				new Ticket(7), new Ticket(4)};
		System.out.println(countGT(a,a[4]));
	}

}
