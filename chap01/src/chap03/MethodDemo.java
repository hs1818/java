package chap03;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ŭ����: �Լ��� ������ ������ �ִ� ���赵
		int sum=0;
		for(int i=0; i<=10; i++) {
			sum += i;
		}
		System.out.println("��(1~10):" +sum);
		sum =0;
		
		for(int i =10; i<=100; i++) {
			sum+= i;
		}
		System.out.println("��(10~100):" +sum);
		sum =0;
		
		for(int i =100; i<=1000; i++) {
			sum+= i;
		}
		System.out.println("��(100~1000):" +sum);
		
	}

}
