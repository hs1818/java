package chap10;

public class GenericClass1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cup c = new Cup();
		
		c.setBeverage(new Boricha());
		
		c.setBeverage(new Beer());
		
		Beer b1 = (Beer)c.getBeverage();
		
		Boricha b2 = (Boricha) c.getBeverage();
	}

}
