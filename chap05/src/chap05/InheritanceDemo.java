package chap05;



public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circles c1 = new Circles();
		Ball c2= new Ball("빨간색");
		
		System.out.println("원: ");
		
		c1.findRadius(); //c1은 private사용한거 빼고 다 사용 가능
		c1.findArea();

		System.out.println("\n공: ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();
		
	}

}
