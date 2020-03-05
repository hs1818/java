package chap06;

public class GirlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl[] girls = {
				new Girl("������"),
				new GoodGirl("����"),
				new BestGirl("Ȳ����")
		};
		for (Girl g :girls) {
			g.show(); //�������� �̿��Ͽ� ������ �޼��� ����
		}
//		Girl g1 =new Girl();
//		//�θ�Ŭ���� Girl����ϰ� �ڽ�Ŭ���� Goodgirl�� ��ü���� //�θ�Ŭ���� Ÿ������ ����Ǳ⶧���� girlŬ������ ���� ����� ��� ����
//		Girl g2 = new GoodGirl();
//		//�θ�Ŭ���� goodgirl�� ��ü�� ���� �����ϰ� �����ڸ� �ڽ�Ŭ����Bestgirl�����ڸ� ����� ��ü���� /�θ�Ŭ���� goodgirl����� ��밡��
//		GoodGirl gg = new BestGirl();
//		
//		g2.show();
//		gg.show(); //BestgirlŬ�������� show�޼��� ��ӹ޾� �������̵� �Ͽ� ��� 
	}

}

class Girl {
	protected String name; //��ӹ��� Ŭ���� ���ٰ���, �ܺ����� ����
	void show() {
		System.out.println(this.name+"�� �ڹ� �ʺ����̴�");
	}
	
//	public Girl() {
//		
//	}
	
	public Girl(String name) {
		this.name = name;
	}
}

class GoodGirl extends Girl {
	//goodgirlŬ������ �����ڰ� ��� �⺻ ������ �����ؼ� ���
	//girlŬ���� ��� �޾����Ƿ� �⺻�����ڿ� super(�θ�Ŭ������ girl�� �⺻�����ڸ� ȣ��)�� �ԷµǾ� ����
//	public GoodGirl() {
//		super();
//	}
	
	public GoodGirl(String name) {
		super(name);
		this.name = name;
	}
	void show() {
		System.out.println(this.name+ "�� �ڹٸ� �� �ȴ�");
	}
}

class BestGirl extends GoodGirl{
	
	public BestGirl(String name) {
		super(name);
		this.name = name;
	}
	void show() {
		System.out.println(this.name+ "�� �ڹٸ� �����ϰ� �� �ȴ�");
	}
}
