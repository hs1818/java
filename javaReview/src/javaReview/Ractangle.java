package javaReview;

public class Ractangle {
	int width;
	int height;
	
	public void area1() {
		int width =10;
		int height =10;
		System.out.println("�簢���� ���̴�"+width*height);
	}
	public void area2() {
		int x =0;
		for(int i= 0; i<5; i++) {
			int y =0;
			System.out.println("����x�� ��:" +x + "����y�ǰ�"+y);
			x++;
			y++;
			
		}
	}
}
