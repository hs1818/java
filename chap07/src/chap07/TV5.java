package chap07;
//�߻�Ŭ���� ��ӹ޾Ƽ� �߻�޼��带 �����ؾ���
public class TV5 extends Controller{
	String name ="TV";
	
	public TV5(boolean power) {
		super(power); //�̰��ϰų� power =b;
//		this.power =b;
	}
	@Override
	String getName() {
		return this.name;
	}
}
