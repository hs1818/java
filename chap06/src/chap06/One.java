package chap06;

public class One {
	private int secret =1; //해당 클래스 내에서 사용, 외부접근x
	int roommate =2;       //접근제한자 default, 외부접근x
	protected int child =3; //자식클래스에서 접근 가능
	public int anybody =4;  //모든 영역에서 접근 가능
	
	public void show() {   //모든영역 접근 가능
		
	}
}
