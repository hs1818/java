package chap01;
import java.util.Scanner;
public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������ -�ڹٽ�ũ��Ʈ�� ����
		//��� ������: +,-,*,/% 4Ģ����. *,/,%�� +,-���� �켱���� ����
		//����: ++, -- 1��ŭ ����or����, �켱������ ���� ����
			//�ش� �����ڰ� �� �������� �տ� ���� ��� ������� �����ϱ� ���� �����͸� ������Ŵ
			//�ش� �����ڰ� �� �������� �ڿ� ���� ��� ������� ������ �Ŀ� �����͸� ������Ŵ
		System.out.println("-----����");
		int data = 10;
		System.out.println("���� data�� ��:" + data);
		data++;
		System.out.println("���� ��� �� data�� ��"+data);
		data++;
		System.out.println("���� ��� �� data�� ��"+data);
		
		int data2 = 10;
		System.out.println("���� data2��"+ data2);
		System.out.println("�������� �����ڷ� �� ���� �� data2�� ��:" + ++data2);
		System.out.println("�������� �����ڷ� �� ���� �� data2�� ��:" + data2++);
		System.out.println("���� data2�� ��:" +data2);
		System.out.println("���� ���������ڷ� �� ���� �� data2�� ��:" + data2--);
		System.out.println("���� ���������ڷ� �� ���� �� data2�� ��:" + --data2);
		System.out.println("���� data2�� ��:" +data2);
		
		System.out.println("---------����(3��)������"); //�ް����� if else�� ����
		int a =1;
		int b;
		b = (a==1)?10:20;
		System.out.println(b);
		b = (a > 1)? a++ : a+20;
		System.out.println(a);
		System.out.println(b);
		
		
		//����: =, +=, -=, *=, /=, %=, ���� �켱������ ���� ����
		//��: >, >=, <, <=, ==, !=, instanceof(Ŭ���� ����ü ��ü�� �ش� Ŭ������ ���ϱ� ���� ��), �������� ��or Ÿ�� ��
		System.out.println("-----����/��");
		String str =new String();
		StringBuilder sb = new StringBuilder();
		
		if(str instanceof String) {
			System.out.println("str�� string�� ��ü�Դϴ�");
		}
		else {
			System.out.println("str�� string�� ��ü�� �ƴմϴ�");
		}
		
		if(sb instanceof StringBuilder) {
			System.out.println("sb�� StringBuilder�� ��ü�Դϴ�");
		}
		else {
			System.out.println("sb�� StringBuilder�� ��ü�� �ƴմϴ�");
		}
		
		//��Ʈ: &,!,~,^ 
		//��: %%,||, ~ �ַ� if������ ������ 2�� �̻� ����ϰ��� �� ��� ���
		System.out.println("---��� ���� ����");
		int remainer = 25%2;
		System.out.println("25/2�� ��������"+ remainer+"�Դϴ�");
		
		System.out.println("---��/������ ����");
		int x =0;
		int y =1;
		System.out.println((x<1) || (y-- <1));
		System.out.println("x=" + x+ ",y =" +y);
		
		x= 0;
		y=1;
		System.out.println((x<1) | (y-- <1));
		System.out.println("x=" + x+ ",y =" +y);
		
		System.out.println("--------��Ʈ/����Ʈ ������");
		System.out.printf("%x\n", 0b0101 & 0b0011);
		System.out.printf("%x\n", 0b0101 | 0b0011);
		System.out.printf("%x\n", 0b0101 ^ 0b0011);
		System.out.printf("%x\n", (byte)~ 0b00000001);
		System.out.printf("%x\n", 0b0110 >> 2);
		System.out.printf("%x\n", 0b0110 << 2);
		
		int i1 = -10;
		int i2 = i1 >> 1;
		int i3 = i1 >>> 1;
		System.out.printf("%x->%d\n", i1, i1);
		System.out.printf("%x->%d\n", i2, i2);
		System.out.printf("%x->%d\n", i3, i3);
		
		
		
	}

}
