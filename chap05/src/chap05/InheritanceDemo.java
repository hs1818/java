package chap05;



public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circles c1 = new Circles();
		Ball c2= new Ball("������");
		
		System.out.println("��: ");
		
		c1.findRadius(); //c1�� private����Ѱ� ���� �� ��� ����
		c1.findArea();

		System.out.println("\n��: ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();
		
	}

}
