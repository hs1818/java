package chap05;

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani = new Animal();
		ani.eat();
		ani.sleep();
		
		Eagle e = new Eagle();
		e.eye = "¸ÅÀÇ ´«";
		e.eat();
		e.fly();
		e.sleep();
		
		Tiger t = new Tiger();
		t.eat();
		t.run();
		t.sleep();
		
		Goldfish g = new Goldfish();
		g.eat();
		g.sleep();
		g.swim();
	}

}
