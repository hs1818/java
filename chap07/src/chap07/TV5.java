package chap07;
//추상클래스 상속받아서 추상메서드를 구현해야함
public class TV5 extends Controller{
	String name ="TV";
	
	public TV5(boolean power) {
		super(power); //이거하거나 power =b;
//		this.power =b;
	}
	@Override
	String getName() {
		return this.name;
	}
}
