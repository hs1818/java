package javaReview;

public class GolfClubTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GolfClub g1 = new GolfClub();
		g1.print();
		
		GolfClub g2 = new GolfClub(8);
		g2.print();
		
		GolfClub g3 = new GolfClub("����");
		g3.print();
	}

}

class GolfClub {
	String name = "";
	int num = 0;
	
	public GolfClub() {
		this.num = 7;
		this.name = "���̾�";
	}
	
	public GolfClub(int num) {
		this.num = num;
		this.name = "���̾�";
	}
	
	public GolfClub(String name) {
		this.num = 0;
		this.name = name;
	}
	public void print() {
		if(this.num ==0 ) {
			System.out.println(this.name+"�Դϴ�");
		}
		else {
			System.out.println(this.num+"��"+this.name+"�Դϴ�");
		}
	}
}
