package chap09;

public class ClassDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keyboard k = new Keyboard("Logitech");
		
		Class c = k.getClass(); //��ük�� Ŭ������ �����ͼ� classŸ���� ��üc�� ����
		
		System.out.println(c.getClass());
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
		System.out.println(c.getPackage().getName());
	}

}
