package chap03;

import java.util.Scanner;

public class SimplefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���
			//�ڹ����α׷����� ���ǿ� ���� ���α׷��� �帧�� ������ �� ����
			//�ڹٽ�ũ��Ʈ ����� ������
			//if, if else, else if, switch case
		
		//if: ���� ������� true�϶� �߰��� �ڵ� ����
		Scanner in = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int number = in.nextInt();
		
		if(number % 2 ==0) {
			System.out.println("¦��!");
		}
		if(number %2 ==1) {
			System.out.println("Ȧ��!");
		}
		System.out.println("����");
		
		System.out.println("--------if else");
		//if else
		//���ǿ� ���� true false�϶� �����ڵ尡 �޶���
		//���߿� ������ �ϳ� ����
		System.out.print("���ڸ� �Է��ϼ���:");
		int number2 = in.nextInt();
		if(number2 %2 ==0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
		System.out.println("����");
		
		System.out.println("--------3�� ������ ���");
		System.out.println(number2 % 2 ==0?"¦��":"Ȧ��");

		System.out.println("--------else if");
		//else if �������� ���� ��
		//������ else�� �ʿ���� �� �����ص� ��
		String grade ="";
		System.out.print("���� �Է��ϼ���: ");
		
		int score = in.nextInt();
		if(score >=90) {
			grade = "A";
		}
		else if(score >=80) {
			grade = "B";
		}
		else if(score >=70) {
			grade = "C";
		}
		else if(score >=60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		System.out.println("����� ������"+grade);
		
		System.out.println("-----------��ø if��");
		String grade1 ="";
		System.out.print("���� �Է��ϼ���: ");
		
		int score1 = in.nextInt();
		if(score1 >=90) {
			if(score1>=96) {
				grade1 = "A";
			}
			else {
				grade1 = "A";
			}	
		}
		else if(score1 >=80) {
			if(score1>=86) {
				grade1 = "B+";
			}
			else {
				grade1 = "B";
			}
		}
		else if(score1 >=70) {
			if(score1>=76) {
				grade1 = "C+";
			}
			else {
				grade1 = "C";
			}
		}
		else if(score1 >=60) {
			if(score1>=66) {
				grade1 = "D+";
			}
			else {
				grade1 = "D";
			}
		}		
		else {
			grade1 = "F";
		}
		System.out.println("����� �����"+grade1);
		
		System.out.println("-------if�� �ڵ���� if�� ��ø�ؼ� A~F��� ������α׷� �ۼ�");
		System.out.print("������ �Է��ϼ���:");
		int score2 = in.nextInt();
		String grade2 = ""; 
		
		if(score2>60) {
			grade2 = "D";
			if(score2 >70) {
				grade2 = "C";
				if(score2>80) {
					grade2 = "B";
					if(score2 > 90) {
						grade2 = "A";
					}
				}
			}
		}
		else {
			grade2 = "F";
		}
		System.out.println("����� ����� :"+grade2);
		
		System.out.println("--------------switch case");
		//switch�� ���ǹ��� ������� case���� ã�Ƽ� �����ϴ� ����
			//case�� ������� ���� �� default�� ������
			//default�� �ݵ�� �ʿ��� ���� �ƴ�(elseó��)
			//switch case���� break �� �Է� �� break�� ���� �� ���� ��� �����
		//break: ���α׷� ���� �� break���� �� ���ǹ�, �ݺ����� ��� ����
		System.out.print("����� �Է��ϼ���");
		int rank = in.nextInt();
		
		switch(rank) {
		case 1:
			System.out.println("1���Դϴ�");
			break;
		case 2:
			System.out.println("2���Դϴ�");
			break;
		case 3:
			System.out.println("3���Դϴ�");
			break;
		default:
			System.out.println("3�� �����Դϴ�");
			break;
		}
		
		

		
	}

}
