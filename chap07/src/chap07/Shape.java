package chap07;

abstract public class Shape { //추상클래스: 추상메서드가 1개이상 존재하는 클래스(객체생성 안되고 반드시 상속받아 사용해야함)
	double pi =3.14;
	
	abstract public void draw(); //추상메서드: 메서드원형만 만들어 놓은 메서드(실행코드 부분없음)
	
	public double findArea() {
		return 0.0;
	}
}
