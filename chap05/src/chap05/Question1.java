package chap05;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------��1");
		int numOfStudents =0;
		int[] scores;
		Scanner in =new Scanner(System.in);
		System.out.println("�л���?");
		numOfStudents =in.nextInt();
		
		System.out.println(numOfStudents+"���� �л� ������ �Է��ϼ���");
		scores = new int[numOfStudents];
		
		for(int i=0; i<scores.length; i++) {
			scores[i] =in.nextInt();
		}
		
		System.out.println(numOfStudents+"���� �л� ������ ������ �����ϴ�");
		for(int i=0; i<numOfStudents; i++) {
			System.out.print(scores[i]+" ");
		}
			
	}

}
