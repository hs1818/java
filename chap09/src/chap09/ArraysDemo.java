package chap09;

//import java.util.*; //�� �� �ϳ�
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a1 = {'j', 'a', 'v', 'a'}; //������ �迭�̶� �C ����ǥ
		char[] a2 = Arrays.copyOf(a1, a1.length);
		System.out.print("�迭 a1:");
		System.out.println(a1);
		System.out.print("�迭 a2:");
		System.out.println(a2);
		
		String[] sa = {"����ũ", "����", "����", "�ٳ���"};
		print(sa);
		
		Arrays.sort(sa);
		print(sa);
		
		System.out.println(Arrays.binarySearch(sa, "����"));
		
		Arrays.fill(sa, 2, 4, "��Ÿ");
		print(sa);
	}
	
	static void print(Object[] oa) {
		for(Object o :oa) {
			System.out.print(o + " ");
		}
		System.out.println();
	}

}
