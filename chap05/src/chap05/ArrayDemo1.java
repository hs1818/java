package chap05;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//�ڹ� �迭�� �����ÿ� ũ�� ����(�������� ũ�� �ø��ų� ���̱� �Ұ���)
//		int score[] =new int[5]; //��迭 ���� �� ũ�� 5
//		int sum = 0;
//		for(int i =0; i<score.length; i++) {
//			score[i] =in.nextInt();
//		}
//		for(int i =0; i<score.length; i++) {
//			sum+= score[i];
//		}
//		System.out.println("��� ="+sum/5.0);
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
			System.out.printf("%d���⵵ ��� ������ = %.2f%%\n" ,i+1, sum1[i]/4);
			sum2+= sum1[i];
		}
		System.out.printf("3�Ⱓ ��� ������ = %.2f%%\n", sum2/3);
		
		int arrSum[] =new int[10];
		//�ڹٿ��� intŸ������ �� �迭 ���� �� �迭�� ��Ұ��� 0���� �ڵ� �ʱ�ȭ��
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
		
		System.out.println("------------------2���� �迭");
		int arr2[][] =new int [5][5]; //�� 2���� �迭
		arr2[0][0] =10; //������ �ֱ�
		
		arr2 = new int[10][10]; //���ο� 2���� �迭 �ֱ�
		for(int i=1; i<arr2.length; i++) {
			System.out.println(i+"��");
			for(int j=1; j<arr2[i].length; j++) {
				arr2[i][j] = i * j;
				System.out.println(i+"*"+j +"="+arr2[i][j]);
			}
		}
		
		int arr3[][] = { //�迭�� ���ÿ� ������ �Է�
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}	
			};
		System.out.println(arr3[2][4]);
		
		
		
	}

}
