package chap05;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//자바 배열은 생성시에 크기 지정(동적으로 크기 늘리거나 줄이기 불가능)
//		int score[] =new int[5]; //빈배열 선언 및 크기 5
//		int sum = 0;
//		for(int i =0; i<score.length; i++) {
//			score[i] =in.nextInt();
//		}
//		for(int i =0; i<score.length; i++) {
//			sum+= score[i];
//		}
//		System.out.println("평균 ="+sum/5.0);
//		
		double interests[][] = {
				{3.2, 3.1, 3.2, 3.0},
				{2.1, 2.7, 2.8, 2,9},
				{4.2, 6.2, 2,3, 6,5}
			};
		double sum1[] = {0.0, 0.0, 0.0};
		double sum2 = 0.0;
		
		for(int i =0; i<interests.length; i++) {
			for(int j =0; j<interests.length; j++) {
				sum1[i] += interests[i][j];
			}
			System.out.printf("%d차년도 평균 이자율 = %.2f%%\n" ,i+1, sum1[i]/4);
			sum2+= sum1[i];
		}
		System.out.printf("3년간 평균 이자율 = %.2f%%\n", sum2/3);
		
		int arrSum[] =new int[10];
		//자바에서 int타입으로 빈 배열 생성 시 배열의 요소값을 0으로 자동 초기화함
		System.out.println(arrSum[0]);
		
		arrSum[0] =1;
		arrSum[1] =1;
		arrSum[2] =1;
		arrSum[3] =1;
		arrSum[4] =1;
		arrSum[5] =1;
		arrSum[6] =1;
		arrSum[7] =1;
		arrSum[8] =1;
		arrSum[9] =1;
		
		int sums = 0;
		for(int i =0; i<arrSum.length; i++) {
			sums += arrSum[i];
			System.out.println(sums);
		}
		
		System.out.println("------------------2차원 배열");
		int arr2[][] =new int [5][5]; //빈 2차원 배열
		arr2[0][0] =10; //데이터 넣기
		
		arr2 = new int[10][10]; //새로운 2차원 배열 넣기
		for(int i=1; i<arr2.length; i++) {
			System.out.println(i+"단");
			for(int j=1; j<arr2[i].length; j++) {
				arr2[i][j] = i * j;
				System.out.println(i+"*"+j +"="+arr2[i][j]);
			}
		}
		
		int arr3[][] = { //배열과 동시에 데이터 입력
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}	
			};
		System.out.println(arr3[2][4]);
		
		
		
	}

}
