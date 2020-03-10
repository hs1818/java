package chap09;

public class ObjectMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse m1 = new Mouse("Logitech");
		Mouse m2 = new Mouse("Logitech");
		Mouse m3 = m1;
		
		Keyboard k1 = new Keyboard("Microsoft");
		Keyboard k2 = new Keyboard("Microsoft");
		
		System.out.println(m1.toString()); //Object클래스가 기본적으로 상속되어 있어서 사용가능
		System.out.println(m1);
		
		System.out.println(k1.toString());
		System.out.println(k1);
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3)); //메모리상에 m3= m1 해서 
		System.out.println(k1.equals(k2));
	}

}
