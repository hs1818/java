package javaReview;

public class Phone {
	String phone = "";
	public Phone(String phone) {
		this.phone = phone;
	}
	public void call(){
		System.out.println(phone +"전화를 건다");
	}
	
	public void callOff(){
		System.out.println(phone +"전화를 끊기");
	}
	
	public void turnOn(){
		System.out.println(phone +"전원켜기");
	}
	
	public void turnOff(){
		System.out.println(phone +"전원끄기");
	}
	
	
	
}
