package javaReview;

public class Phone {
	String phone = "";
	public Phone(String phone) {
		this.phone = phone;
	}
	public void call(){
		System.out.println(phone +"��ȭ�� �Ǵ�");
	}
	
	public void callOff(){
		System.out.println(phone +"��ȭ�� ����");
	}
	
	public void turnOn(){
		System.out.println(phone +"�����ѱ�");
	}
	
	public void turnOff(){
		System.out.println(phone +"��������");
	}
	
	
	
}
