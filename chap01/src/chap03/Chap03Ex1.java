package chap03;

import java.util.Scanner;

public class Chap03Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------------------p116 ��1");
		Scanner in =new Scanner(System.in);
		int result;
		int n;
		System.out.print("������ �Է��ϼ���");
		n = in.nextInt();
		
		result =1;
		while (n>0) {
			result = result*n;
			n--;
		}
		System.out.println(result);
		
			//while true�ϋ�
//		result =1;
//		while (true) {
//			if(n>0) {
//			result = result*n;
//			n--;
//			continue;
//			}
//			System.out.println(result);
//		}
		System.out.println("------------------��2");
		System.out.print("������ �Է��ϼ���");
		n = in.nextInt();
		
		result = factorial(n);
		}
	
		public static int factorial(int x) {
			int r =1;
			for(int i=x; i>0; i--) {
				r = r*i;
			}
			System.out.println(r);
			return r;
		}
		
		
		
		
	}


