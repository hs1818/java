package chap09;

import java.text.MessageFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Car {
	private String model;
	public Car(String model) {
		this.model = model;
	}
	
	//2�������� equals()�� �������̵� �Ͽ� ���
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car c = (Car) obj;
			
			if(model.equals(c.model)) {
				return true;
			}
		}
		return false;
	}
	
	//1������
	public String toString(Object obj) {
//		//���� Ŭ���� car�� object�� ��ӹ޾Ƽ� equals�޼��带 ������� ����
//		boolean result = equals(obj);
//		String str ="";
//		Car c = (Car) obj;  //������� Ÿ�Ժ�ȯ(carŬ���� Ÿ������)
//							//�Ű������� �Ѿ�� yourCar�κ� �� �Ű����� �������ؼ� 
//		
//		if(result ==true) {
//			str = "�� �ڵ����� ["+ this.model+"], �� �ڵ����� ["+c.model+"]�� ���� ����";
//		}
//		else {
//			str = "�� �ڵ����� ["+ this.model+"], �� �ڵ����� ["+c.model+"]�� ���� �ٸ���";
//		}
//		return str;

	
	//3������
	Date d = new Date(); //����ð� ��������
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); //������� ����
	
	String str = MessageFormat.format("�ڵ��� ���� �Ѵ� [{0}]�� �����ϴ�\n��¥: {1}, �ڵ����� =[{0}], "
			+ "������({2}", model,sdf.format(d), "ȫ�浿");
	
	return str;
	}
}

