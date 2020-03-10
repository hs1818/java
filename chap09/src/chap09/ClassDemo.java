package chap09;

public class ClassDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keyboard k = new Keyboard("Logitech");
		
		Class c = k.getClass(); //객체k의 클래스를 가져와서 class타입의 객체c에 저장
		
		System.out.println(c.getClass());
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
		System.out.println(c.getPackage().getName());
	}

}
