package chap05;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------문1");
		int numOfStudents =0;
		int[] scores;
		Scanner in =new Scanner(System.in);
		System.out.println("학생수?");
		numOfStudents =in.nextInt();
		
		System.out.println(numOfStudents+"명의 학생 성적을 입력하세요");
		scores = new int[numOfStudents];
		
		for(int i=0; i<scores.length; i++) {
			scores[i] =in.nextInt();
		}
		
		System.out.println(numOfStudents+"명의 학생 성적은 다음과 같습니다");
		for(int i=0; i<numOfStudents; i++) {
			System.out.print(scores[i]+" ");
		}
			
	}

}
